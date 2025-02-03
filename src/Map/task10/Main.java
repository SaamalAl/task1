package Map.task10;

import java.util.*;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,String> newcoll = new TreeMap<>();
        newcoll.put(2,"two");
        newcoll.put(5,"hyhyt");
        newcoll.put(1,"one");
        newcoll.put(3,"three");
        newcoll.put(4,"four");

        NavigableSet<Integer> navigableSet = (NavigableSet<Integer>) newcoll.keySet();

        System.out.println(navigableSet);
    }
}

