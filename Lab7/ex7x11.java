package Lab7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex7x11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.close();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        //Write your code here
        Set<String> set = new HashSet<>();
         for (int i = 0; i < t; i++) {
            set.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(set.size());
        }

   }
}
