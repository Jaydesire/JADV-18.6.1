import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;


public class Main {

    public static void main(String[] args) {

        //реализатор Function
        Function<String, String[]> stringToDictionaryArray = (string) -> {
            return Arrays.stream(string.split(" "))
                    .sorted()
                    .toArray(String[]::new);
        };

        //Использование Function
        String[] dictionary = stringToDictionaryArray.apply(
                new Scanner(System.in).nextLine()
        );

        //Применение Stream API
        Arrays.stream(dictionary)
                .forEach(System.out::println);
    }
}
