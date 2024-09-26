package TreeSets;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(7);
        numbers.add(5);
        numbers.add(9);

        System.out.println(numbers);

        TreeSet<String> tree_set = new TreeSet<>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        System.out.println("Tree set: ");

        System.out.println(tree_set);



    }
}
