package ngoding;

import java.util.HashSet;
import java.util.Set;

public class Day88 {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("angka : " + numbers);
        Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("angka prima : " + primeNumbers);
        numbers.removeAll(primeNumbers);
        System.out.println("angka bukan bilangan prima: " + numbers);
    }
}
