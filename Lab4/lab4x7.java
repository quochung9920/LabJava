package Lab4;

import java.util.Scanner;

public class lab4x7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.print(
            x > 0 && y > 0 ? "This point lies in the First quadrant":
            x < 0 && y > 0 ? "This point lies in the Second quadrant":
            x < 0 && y < 0 ? "This point lies in the Third quadrant":
            "This point lies in the Fourth quadrant"
        );
        scanner.close();
    }
}
