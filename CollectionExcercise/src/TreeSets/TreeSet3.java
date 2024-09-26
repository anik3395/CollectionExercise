package TreeSets;

import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<String> treeset1 = new TreeSet<String>();
        treeset1.add("Red");
        treeset1.add("Green");
        treeset1.add("Orange");
        System.out.println("Tree set1: "+treeset1);

        TreeSet<String> treeset2 = new TreeSet<String>();
        treeset2.add("Pink");
        treeset2.add("White");
        treeset2.add("Black");
        System.out.println("Tree set2: "+treeset2);

        treeset1.addAll(treeset2);
        System.out.println("The New sorted tree: " + treeset1);
    }
}
