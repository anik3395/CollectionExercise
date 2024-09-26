package HashSets;

import java.util.HashSet;

public class HashSet7 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        System.out.println(colors);

        String[] array = colors.toArray(new String[colors.size()]); // Convert Hashset to Array..

        // Display the array
        for (String element : array) {
            System.out.println(element);
        }


    }
}
