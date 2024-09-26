package ArrayListW3Resourse;

import java.util.ArrayList;

public class ArrayList15 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Grape");
        list2.add("Pineapple");
        list2.add("Mango");

//        ArrayList<String> jointList = new ArrayList<>(list1);
//        jointList.addAll(list2);
//        System.out.println(jointList);

        list1.addAll(list2);
        System.out.println(list1);

        list2.addAll(list1);
        System.out.println(list2);
    }
}
