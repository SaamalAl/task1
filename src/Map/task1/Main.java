package Map.task1;

import java.util.*;
import java.util.HashSet;



public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> newcoll = new HashMap<>();
        newcoll.put(2,"two");
        newcoll.put(1,"one");
        newcoll.put(3,"three");
        newcoll.put(4,"four");
        newcoll.put(5,"five");

        Integer key = 6;

        if(newcoll.containsKey(key)){
            System.out.println("коллекция содержит отображение для ключа "+key);
        }
        else{
            System.out.println("коллекция не содержит отображение для ключа "+key);
        }

    }
}

