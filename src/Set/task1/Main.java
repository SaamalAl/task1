package Set.task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("роза");
        words.add("тюльпан");
        words.add("пион");
        words.add("лилия");
        words.add("гортензия");

        Object[] array = words.toArray();

        for(Object obj : array){
            System.out.println(obj);
        }
    }
}
