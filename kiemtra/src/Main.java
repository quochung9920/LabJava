import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        try{
//            int a = scanner.nextInt();
//        } catch (NumberFormatException ex){
//            System.out.println();
//        }

        

        Thread t1 = new Thread(
                () -> {
                    System.out.println("Hello1");
                }
        );

        t1.start();




    }
}