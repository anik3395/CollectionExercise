package ArrayListW3Resourse;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");

//        Iterator<String> iterator = colors.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

         //OR------->

        for (String i : colors){
            System.out.println(i);
        }


    }
}
