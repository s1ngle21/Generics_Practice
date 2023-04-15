package first_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {2, 5, 8, 2, 4};
        String[] strings = {"apple", "grape", "peach"};

        System.out.println(toList(ints));

        System.out.println("----------------------");

        System.out.println(toList(strings));
    }

    public static <T> List<T> toList(T[] obj) {
        Objects.requireNonNull(obj);
        List<T> list = new ArrayList<>();
        list.addAll(Arrays.asList(obj));
        return list;
    }
}
