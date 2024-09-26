package HashSets;

import java.util.TreeSet;

public class HashSet9 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(8);
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);
        numbers.add(6);
        numbers.add(12);

        System.out.println(numbers);
        TreeSet<Integer> numbersLessThan7 = (TreeSet<Integer>) numbers.headSet(10);
        System.out.println(numbersLessThan7);
    }
}
