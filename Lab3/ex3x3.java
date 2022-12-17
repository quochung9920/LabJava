package Lab3;

import java.math.*;
import java.util.Scanner;

public class ex3x3 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        BigInteger A = input.nextBigInteger();
        BigInteger B = input.nextBigInteger();

        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
        input.close();
    }
}
