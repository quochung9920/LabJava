package Lab6;

import java.util.Scanner;

public class ex6x6 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Gán giá trị ban đầu cho smallest là phần tử đầu tiên của chuỗi
        smallest = s.substring(0, k);

        // Duyệt chuỗi từ vị trí thứ k, so sánh với smallest, nếu nhỏ hơn thì gán lại
        for (int i = 0; i + k - 1 < s.length(); i++) {
            if (s.substring(i, i + k).compareTo(smallest) < 0) {
                smallest = s.substring(i, i + k);
            }
        }

        // Gán giá trị ban đầu cho largest là phần tử đầu tiên của chuỗi
        largest = s.substring(0, k);

        // Duyệt chuỗi từ vị trí thứ k, so sánh với largest, nếu lớn hơn thì gán lại
        for (int i = 0; i + k - 1 < s.length(); i++) {
            if (s.substring(i, i + k).compareTo(largest) > 0) {
                largest = s.substring(i, i + k);
            }
        }

        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
