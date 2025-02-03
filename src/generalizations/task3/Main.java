package generalizations.task3;

public class Main {
    public static void main(String[] args) {
        Elements elements = new Elements();

        String[] array1 = {"Cat","Dog","Mouse"};
        Integer[] array2 = {1,2,3,4};

        System.out.println("Элементы первого массива: ");
        elements.printElems(array1);

        System.out.println("Элементы второго массива: ");
        elements.printElems(array2);
    }
}


