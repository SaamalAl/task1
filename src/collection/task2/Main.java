package collection.task2;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("арбуз","ягода");
        map.put("банан","трава");
        map.put("вишня","ягода");
        map.put("груша","фрукт");
        map.put("дыня","овощ");
        map.put("ежевика","куст");
        map.put("жень-шень","корень");
        map.put("земляника","ягода");
        map.put("ирис","цветок");
        map.put("картофель","клубень");

        for(String key : map.keySet()){
            System.out.println(key+"-"+map.get(key));
        }
    }
}

