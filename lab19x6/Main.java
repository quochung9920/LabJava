import java.util.ArrayList;
import java.util.List;

public class Main {

    public static class Pair<T, U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }
    }

    public static void main(String[] args) {
        Function f = (x) -> x * x;
        System.out.println(f.f(5));
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ArrayList<Integer> newList = new ArrayList<Integer>();

        Pair<Integer, String> pair = new Pair<>(1, "Hello");
    }
}
