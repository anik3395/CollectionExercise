package ArrayListW3Resourse;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");

        System.out.println(colors);

        colors.add(0,"Nevy Blue");  // Insert process...
        System.out.println(colors);
    }
}
