package functional;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        int[] array = new int[10];

        List<Integer> arrayList = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> linkedList = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println(arrayList.getClass());
        System.out.println(linkedList.getClass());
    }
}
