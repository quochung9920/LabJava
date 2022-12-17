package Lab6;

import java.util.Scanner;

public class lab6x4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		int answer = 1;
		for (int i = 1; i <= n; i++) {
			answer *= i;
		}
		System.out.print(answer);
	}
}
