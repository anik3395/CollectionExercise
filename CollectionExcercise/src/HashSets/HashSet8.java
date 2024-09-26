package HashSets;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet8 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Grape");
        hashSet.add("Orange");
        hashSet.add("Cucamber");

        // Convert the HashSet to a TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet); // Alphabet wise Sorted..

        System.out.println(treeSet);

        // Display the TreeSet
//        System.out.println("TreeSet elements (sorted):");
//        for (String element : treeSet) {
//            System.out.println(element);
//        }

        HashSet<Integer> number = new HashSet<>();
        number.add(7);
        number.add(1);
        number.add(5);
        number.add(3);
        number.add(8);

        TreeSet<Integer> number1 = new TreeSet<>(number);
        System.out.println(number1);


    }
}
