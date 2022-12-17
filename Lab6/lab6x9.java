package Lab6;

import java.util.Scanner;

public class lab6x9 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        sc.close();
		while (a <= b) {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
	}
}
