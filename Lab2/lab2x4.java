

import java.util.Scanner;

public class lab2x4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		System.out.print(s1.indexOf(s2));
		sc.close();
	}
}
