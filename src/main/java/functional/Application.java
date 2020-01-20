package functional;

import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {
        Consumer<String> consumer = o -> System.out.println("hello" + o);

        consumer.accept("aa");
    }
}
