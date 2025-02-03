package Map.task7;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> newcoll = new HashMap<>();
        newcoll.put(2, "two");
        newcoll.put(1, "one");
        newcoll.put(3, "three");
        newcoll.put(4, "four");
        newcoll.put(5, "five");

        System.out.println("коллекция: "+ newcoll);

        newcoll.put(3,"edit");
        System.out.println("коллекция с изменением: "+ newcoll);

    }
}

