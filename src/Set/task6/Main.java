package Set.task6;

import java.util.*;
import java.util.HashSet;



public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(11);
        set2.add(2);
        set2.add(1);
        set2.add(6);
        set2.add(3);




        HashSet<Integer> clon = getClonEl(set1,set2);
        System.out.println("общие элементы: "+clon);

    }

    private static HashSet<Integer> getClonEl(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> clon = new HashSet<>(set1);
        clon.retainAll(set2);
        return clon;
    }
}
