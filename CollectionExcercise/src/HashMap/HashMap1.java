package HashMap;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer , String> names = new HashMap<>();
        names.put(31,"Anik");
        names.put(32,"Irad");
        names.put(33,"Emon");
        names.put(34,"Rakin Bhai");

        System.out.println(names);
        System.out.println(names.size());

        System.out.println(names.get(34));
    }
}
