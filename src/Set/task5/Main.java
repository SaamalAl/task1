package Set.task5;

import java.util.*;


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


        int sum1=calculateSum(set1);
        int sum2=calculateSum(set2);

        if(sum1==sum2){
            System.out.println("коллекции равны");
        }
        else{
            System.out.println("коллекции разные");
        }

        boolean areEqual = set1.equals(set2);
        System.out.println(areEqual);
    }

    private static int calculateSum(HashSet<Integer> set) {
        int sum=0;
        for(int num : set){
            sum+=num;
        }
        return sum;
    }
}
