package Lab6;

import java.util.Scanner;

public class ex6x8 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scan = new Scanner(System.in);

        // Nhập vào một chuỗi
        String s = scan.nextLine();
        scan.close();
        s = s.trim();

        // Nếu chuỗi rỗng thì in ra 0
        if(s.length()<=0){
            System.out.println(0);
            return;

        }else{
            // Tách chuỗi theo các ký tự đặc biệt
            String[] tokens = s.split("[ ?._'@!,]+");
            System.out.println(tokens.length);
            for(String x : tokens){
                System.out.println(x);
            }
        }
    }
}
