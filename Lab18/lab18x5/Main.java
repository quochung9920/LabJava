package lab18x5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        List<String> topNames2015 = Arrays.asList("Amelia","Olivia","emily","Isla","Ava","oliver","Jack","Charlie","harry","Jacob");
        // Sắp xếp mảng chuỗi theo thứ tự bảng chữ cái
        // // Cách 1: Cách code của người học
        // topNames2015.sort((s1, s2) -> s1.compareTo(s2));
        // // Cách 2: Cách code của professor
        // topNames2015.sort(String::compareTo);

        // topNames2015.forEach(name -> System.out.println(name.substring(0,1).toUpperCase() + name.substring(1)));
        // topNames2015.forEach(System.out::println);


        // topNames2015
        // .stream()
        // .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
        // .peek(System.out::println)
        // .sorted(String::compareTo);

        topNames2015
        .stream()
        .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
        .peek(System.out::println)
        .sorted(String::compareTo)
        .collect(Collectors.toList());

    }
            

}
