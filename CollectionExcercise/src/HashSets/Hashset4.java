package HashSets;

import java.util.HashSet;

public class Hashset4 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        System.out.println(colors);
        System.out.println(colors.isEmpty());

        colors.removeAll(colors);
        System.out.println(colors);
    }
}
