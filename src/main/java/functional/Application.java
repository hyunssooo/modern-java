package functional;

import java.util.function.Function;

public class Application {
    public static void main(String[] args) {
        Function<String, Integer> toInt = s -> Integer.parseInt(s);

        System.out.println(toInt.apply("12"));

        Function<Integer, Integer> identity = t -> t;
    }
}
