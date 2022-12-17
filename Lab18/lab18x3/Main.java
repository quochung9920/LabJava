import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> iLoveJava = () -> "I love Java!";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        Callable <String> iLoveJava2 = () -> "I love Java!";
        try {
            String callableResult = iLoveJava2.call();
            System.out.println(callableResult);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}