package Lab6;

import java.util.Scanner;

public class ex6x4 {
    public static void main(String[] args) {
        //Nhập vào 2 số nguyên dương a và b. Tính a*b
        Scanner scan = new Scanner(System.in);
        int var1 = scan.nextInt();
        int var2 = scan.nextInt();
        if (var1 > 0 && var2 > 0) {
            System.out.println(var1 * var2);
        } else
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        scan.close();
    }
}
