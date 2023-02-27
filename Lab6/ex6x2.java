package Lab6;

import java.util.Scanner;

public class ex6x2 {
    public static void main(String[] arg) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner in = new Scanner(System.in);
        // Nhập số lần test case
        int t = in.nextInt();

        // Vòng lặp for để lặp lại việc nhập dữ liệu cho từng test case
        for (int i = 0; i < t; i++) {
            // Mỗi test case sẽ có 3 số nguyên a, b, n
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int total = 0;
            // Vòng lặp for để tính và in ra kết quả
            for (int j = 0; j < n; j++) {
                total += (Math.pow(2, j));
                System.out.printf("%d ", a + total * b);
            }

            System.out.println();
        }

        // Đóng đối tượng Scanner
        in.close();
    }
}
