package ngoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Day99 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
        System.out.println("Duplikat : " + numbers);

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(numbers);
        numbers.clear();
        numbers.addAll(set);
        System.out.println("Tanpa duplikat : " + numbers);
    }
}
