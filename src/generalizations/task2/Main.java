package generalizations.task2;


public class Main {

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5} ;
        Math<Integer> intMath = new Math<>(intArray);
        System.out.println("сумма целых чисел: "+intMath.sumNum());
    }
}

