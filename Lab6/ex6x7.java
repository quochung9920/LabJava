package Lab6;

import java.util.Scanner;

public class ex6x7 {
    public static void main(String[] args) {

        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Nhập vào một chuỗi
        String A = sc.next();
        
        String reverse = "";

        // Duyệt chuỗi từ cuối lên đầu, lưu vào biến reverse
        for (int i = A.length() - 1; i >= 0; i--) {
            reverse = reverse + A.charAt(i);
        }
        if (reverse.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
