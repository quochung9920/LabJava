package Lab6;

import java.util.Scanner;

public class ex6x3 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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
