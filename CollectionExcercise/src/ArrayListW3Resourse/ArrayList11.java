package ArrayListW3Resourse;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList11 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");

        System.out.println(colors);

        Collections.reverse(colors); // Reverse Process...
        System.out.println(colors);

    }


}
