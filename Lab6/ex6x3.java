package Lab6;

import java.util.Scanner;

public class ex6x3 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scan = new Scanner(System.in);
        
        int n = 1;
        
        while(scan.hasNext())
        {
            System.out.print(n + " " + scan.nextLine() + "\n");
            n++;
        }
        scan.close();
    }
}
