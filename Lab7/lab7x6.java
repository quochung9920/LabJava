package Lab7;

import java.util.Scanner;

public class lab7x6 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] % 2 != 0 && arr[i] > 0) {
				answer += arr[i];
			}
		}
		System.out.print(answer);
        sc.close();
	}
}