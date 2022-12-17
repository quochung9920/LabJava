package Lab6;

import java.util.Scanner;

public class lab6x6 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		
		while(n <= 100) {
			if (n % 2 == 0) {
				System.out.print(n + " ");
			}
			n += 1;
		}
	}
}
