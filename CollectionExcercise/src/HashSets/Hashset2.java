package HashSets;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset2 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        Iterator<String> ite = colors.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
