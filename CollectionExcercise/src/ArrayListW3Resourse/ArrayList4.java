package ArrayListW3Resourse;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");

        System.out.println(colors);

        System.out.println(colors.get(0));  //retrieve or Get...
        System.out.println(colors.get(3));
    }
}
