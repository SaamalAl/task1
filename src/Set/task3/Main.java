package Set.task3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("роза");
        words.add("тюльпан");
        words.add("пион");
        words.add("лилия");
        words.add("гортензия");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(words);
        System.out.println(treeSet);
    }
}

