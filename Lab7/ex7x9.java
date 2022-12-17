package Lab7;

import java.util.HashMap;
import java.util.Scanner;

public class ex7x9 {
    public static void main(String []argh)
	{
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
	}
}
