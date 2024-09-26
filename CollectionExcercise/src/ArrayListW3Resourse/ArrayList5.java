package ArrayListW3Resourse;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");

        System.out.println(colors);

        colors.set(0,"Gray");
        System.out.println(colors);

        colors.set(2,"Hot Pink");
        System.out.println(colors);
    }
}
