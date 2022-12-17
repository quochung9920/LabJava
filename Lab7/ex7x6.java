// package Lab7;

// import java.util.ArrayList;
// import java.util.Scanner;

// public class ex7x6 {
//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner scanner = new Scanner(System.in);
//         ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
//         ArrayList<Integer> temp = new ArrayList<>();

//         int n = scanner.nextInt();
        
//         int m = 0;
//         for (int i = 0; i < n; i++) {
//             m = scanner.nextInt();
//             for (int j = 0; j < m; j++) {
//                 temp.add(scanner.nextInt());
//             }
//             arrayList.add((ArrayList<Integer>) temp.clone());
//             temp.clear();
//         }
//         int q = scanner.nextInt();
//         for (int i = 0; i < q; i++) {
//             try {
//                 System.out.println(arrayList.get(scanner.nextInt() - 1).get(scanner.nextInt() - 1));
//             } catch (Exception e) {
//                 System.out.println("ERROR!");
//             }
//         }
//         scanner.close();
//     }
// }
