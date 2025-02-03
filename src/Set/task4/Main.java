package Set.task4;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("роза");
        words.add("тюльпан");
        words.add("пион");
        words.add("лилия");
        words.add("гортензия");

        TreeSet<String> treeSet = new TreeSet<>(Collections.reverseOrder());
        treeSet.addAll(words);
        System.out.println(treeSet);
    }
}

