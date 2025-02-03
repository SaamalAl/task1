package Set.task7;

import java.util.*;
import java.util.HashSet;



public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(10);
        set1.add(14);
        set1.add(439);

        System.out.println("элементы меньше 7: "+set1.headSet(7,false));


    }
}

