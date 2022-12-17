package Lab7;

import java.util.Scanner;

public class lab7x5 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] == k) {
				count++;
			}
		}
		System.out.print(count);
        sc.close();
	}
}
