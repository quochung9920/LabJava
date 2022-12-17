import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static Set<String> listFilesUsingDirectoryStream(String dir) throws IOException {
        // Tạo một Set để lưu trữ tên các tệp trong thư mục được chỉ định bởi đối số dir truyền vào hàm này và có tên không trùng nhau
        Set<String> fileSet = new HashSet<>();
        // Tạo một đối tượng DirectoryStream để duyệt qua các tệp trong thư mục được chỉ định bởi đối số dir truyền vào hàm này
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(dir))) {
            for (Path path : stream) {
                if (!Files.isDirectory(path)) {
                    fileSet.add(path.getFileName()
                        .toString());
                    System.out.println(path.getFileName()
                        .toString());
                }
            }
        }
        return fileSet;
    }

    public static boolean checkFileNameValid(String fileName){
        // Tạo một đối tượng Pattern để kiểm tra tên tệp có đúng định dạng năm-tháng-ngày.txt hay không
        Pattern p = Pattern.compile("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])(.txt)$");
        // Tạo một đối tượng Matcher để so khớp với đối tượng Pattern
        Matcher m = p.matcher(fileName);
        return m.matches();
    }

    public static Map<String, List<String>> readFileInFolderToMap(String rootFolder){
        // Tạo một Map để lưu trữ tên các thư mục là key và danh sách các tên tệp trong thư mục đó là value
        Map<String, List<String>> folderMap = new HashMap<>();
        // Tạo một đối tượng DirectoryStream để duyệt qua các tệp trong thư mục được chỉ định bởi đối số dir truyền vào hàm này
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(rootFolder))) {
            for (Path path : stream) {
                System.out.print("Check item: " + path.getFileName());
                if (!Files.isDirectory(path)) {
                    String fileName = path.getFileName().toString();
    
                    if (checkFileNameValid(fileName)){
    
                        System.out.println("--- File valid!");
    
                        // Tách phần tên thư mục
                        String newFolder = fileName.substring(0, fileName.lastIndexOf("-"));
    
                        List<String> listFileInFolder = new ArrayList<>();
    
                        // Nếu thư mục đã tồn tại thì lấy ra danh sách tên các tệp hiện có sau đó add tên mới vào danh sách
                        if (folderMap.containsKey(newFolder)){
                            listFileInFolder = folderMap.get(newFolder);
                        }
    
                        listFileInFolder.add(fileName);
                        folderMap.put(newFolder, listFileInFolder);
    
                    } else {
                        System.out.println("--- File invalid will be removed !");
                        Files.delete(path);
                    }
                } else {
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return folderMap;
    }


    public static void createFolderAndMoveFile(String rootFolder, Map<String, List<String>> folderMap){
        // Đọc dữ liệu từ map để tạo thư mục và di chuyển tệp vào thư mục
        for (String newFolder : folderMap.keySet()){
            Path newFolderPath = Paths.get(rootFolder, newFolder);
            try {
                // Tạo thư mục mới
    
                //
                Files.createDirectory(newFolderPath);
                for (String fileName: folderMap.get(newFolder)){
                    // Di chuyển thư mục
    
                    //
                    Path oldFilePath = Paths.get(rootFolder, fileName);
                    Path newFilePath = newFolderPath.resolve(fileName);
                    Files.move(oldFilePath, newFilePath);
                    System.out.println("Move file :" + oldFilePath + " ===>  :" + newFilePath);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    

    public static void main(String[] args) {
        try {
            Files.createFile(Paths.get("./2022/abc.txt"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            listFilesUsingDirectoryStream("./2022");
            readFileInFolderToMap("./2022");
            createFolderAndMoveFile("./2022", readFileInFolderToMap("./2022"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
