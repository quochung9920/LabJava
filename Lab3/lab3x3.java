package Lab3;

import java.util.Scanner;

public class lab3x3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		System.out.println("In 15 years, age of " + name + " will be " + (age + 15));
	
        sc.close();
	}
}
