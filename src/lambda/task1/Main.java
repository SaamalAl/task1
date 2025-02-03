package lambda.task1;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer,Integer> square = x -> x*x;

        System.out.println(square.apply(5));
        System.out.println(square.apply(4));
    }
}

