package collection.task1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);

        for(Integer num : set){
            System.out.println(num);
        }
    }
}

