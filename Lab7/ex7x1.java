package Lab7;

import java.util.Scanner;

public class ex7x1 {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length())
            return false;
        StringBuilder lowA = new StringBuilder(a.toLowerCase());
        StringBuilder lowB = new StringBuilder(b.toLowerCase());
        for (int i = 0; i < lowA.length(); i++) {
            for (int j = 0; j < lowB.length(); j++) {
                if (lowA.charAt(i) == lowB.charAt(j)) {
                    lowB.deleteCharAt(j);
                    break;
                }
            }
        }
        return lowB.length() == 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
