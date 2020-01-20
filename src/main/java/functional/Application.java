package functional;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Application {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        printValid(true, getVeryExpensiveValue());
        printValid(false, getVeryExpensiveValue());
        printValid(false, getVeryExpensiveValue());
        System.out.println((System.currentTimeMillis() - start) / 1000 + "초 걸린다.");

        start = System.currentTimeMillis();
        printSupplierValid(true, () -> getVeryExpensiveValue());
        printSupplierValid(false, () -> getVeryExpensiveValue());
        printSupplierValid(false, () -> getVeryExpensiveValue());

        System.out.println((System.currentTimeMillis() - start) / 1000 + "초 걸린다.");
    }

    public static String getVeryExpensiveValue() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "test";
    }

    public static void printValid(Boolean isTrue, String value) {
        if (isTrue) {
            System.out.println(value);
            return;
        }
        System.out.println("Invalid");
    }

    public static void printSupplierValid(Boolean isTrue, Supplier<String> value) {
        if (isTrue) {
            System.out.println(value.get());
            return;
        }
        System.out.println("Invalid");
    }
}
