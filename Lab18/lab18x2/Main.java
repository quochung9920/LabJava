import java.util.function.Function;

public class Main {

    public static String everySecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }
    public static void main(String[] args) {
        // Code để chuyển
        // StringBuilder returnVal = new StringBuilder();
        // for (int i = 0; i < s.length(); i++) {
        //     if (i % 2 == 1) {
        //         returnVal.append(s.charAt(i));
        //     }
        // }
        // return returnVal.toString();
            
        // Chuyển sang dạng lambda
        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        String result = everySecondCharacter(lambdaFunction, "1234567890");
        System.out.println(result);
    
    }
}