package Map.task2;

import java.util.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> newcoll = new HashMap<>();
        newcoll.put(2,"two");
        newcoll.put(1,"one");
        newcoll.put(3,"three");
        newcoll.put(4,"four");
        newcoll.put(5,"");

        Integer key = 6;



        if(hasEmptyValue(newcoll)){
            System.out.println("содержание ключа пусто");
        }
        else {
            System.out.println("содержание ключа есть");
        }



    }

    private static boolean hasEmptyValue(HashMap<Integer, String> newcoll) {
        boolean hasEmptyValue = false;
        for(String value : newcoll.values()) {
            if (value.isEmpty()) {
                hasEmptyValue = true;
                break;
            }
        }
        return hasEmptyValue;
    }
}

