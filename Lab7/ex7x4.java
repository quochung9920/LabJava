package Lab7;


import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



public class ex7x4 {
    public static int [][] convertToArray(List<List<Integer>> matrixList){
        int [][] matrix = new int[matrixList.size()][matrixList.size()];
        for(int i = 0 ; i < matrixList.size();i++){
             for(int j = 0 ; j < matrixList.size();j++){
                 matrix[i][j]=matrixList.get(i).get(j);
            }
        }
        return matrix;
    }
    
    public static int sumMaxElement(int [][] matrix){
        int sumMax = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length-2; i++){
            for(int j = 0 ; j < matrix.length-2; j++){
                int sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] 
                                + matrix[i+1][j+1] +
                        matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                sumMax = Math.max(sumMax, sum);
            }
        }
        return sumMax;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        System.out.println(sumMaxElement(convertToArray(arr)));

        bufferedReader.close();
    }
}
