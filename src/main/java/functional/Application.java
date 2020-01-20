package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = i -> i > 0;

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, -1, -3);
        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (isPositive.test(num)) {
                positiveNumbers.add(num);
            }
        }

        System.out.println(positiveNumbers);

        Predicate<Integer> isPositiveLessthanThree = i -> i > 3;

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, -1, -3, 1);
        List<Integer> positiveLessThanThreeNumbers = new ArrayList<>();
        for (Integer num : numbers2) {
            if (isPositiveLessthanThree.test(num)) {
                positiveLessThanThreeNumbers.add(num);
            }
        }

        System.out.println(positiveLessThanThreeNumbers);

        System.out.println(filter(numbers, i -> i > 0));
        System.out.println(filter(numbers2, i -> i > 3));

    }

    public static <T> List<T> filter(List<T> inputs, Predicate<T> predicate) {
        List<T> returns = new ArrayList<>();
        for (T input : inputs) {
            if (predicate.test(input)) {
                returns.add(input);
            }
        }
        return returns;
    }
}
