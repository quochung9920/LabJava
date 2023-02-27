package Lab6;

import java.io.*;

public class ex6x1 {
    // Hàm main có phương thức ném ngoại lệ IOException khi đọc dữ liệu từ bàn phím
    public static void main(String[] args) throws IOException {

        // Khai báo đối tượng bufferedReader thuộc lớp BufferedReader để đọc dữ liệu từ
        // bàn phím
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Nhập dữ liệu từ bàn phím
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // Đóng đối tượng bufferedReader sau khi sử dụng xong
        bufferedReader.close();

        // In ra bảng cửu chương của N
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " " + "x" + " " + i + " = " + N * i);
        }
    }
}