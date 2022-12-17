package Lab7;

import java.util.Scanner;

public class lab7x3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(arr[0] + arr[n - 1]);
        sc.close();
	}
}
