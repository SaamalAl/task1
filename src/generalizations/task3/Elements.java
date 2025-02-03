package generalizations.task3;

public class Elements {
    public <T> void printElems(T[] array){
        for (T elem : array){
            System.out.println(elem);
        }
    }
}

