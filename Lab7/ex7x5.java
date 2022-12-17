package Lab7;

import java.util.Scanner;

public class ex7x5 {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        s.close();
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum < 0) {
                    counter++;
                }
            }
        }

        System.out.print(counter);

    }
}
