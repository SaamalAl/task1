package lambda.task2;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<int[],Integer> sumArray = arr -> Arrays.stream(arr).sum();
        int[] numbers = {1,2,3,4,5,6,7};
        System.out.println(sumArray.apply(numbers));
    }
}

