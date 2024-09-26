package ArrayListW3Resourse;

import java.util.ArrayList;

public class ArrayList13 {
    public static void main(String[] args) {
        // First ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Orange");

        // Third ArrayList (with a different order or element)
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Banana");
        list3.add("Apple");
        list3.add("Grape");

        // Compare list1 and list2 (should return true)
        boolean areEqual1 = list1.equals(list2);
        System.out.println("list1 and list2 are equal: " + areEqual1);

        // Compare list1 and list3 (should return false)
        boolean areEqual2 = list1.equals(list3);
        System.out.println("list1 and list3 are equal: " + areEqual2);
    }
}
