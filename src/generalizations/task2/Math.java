package generalizations.task2;


public class Math <T extends Number>{
    private T[] numbers;
    public Math(T[] numbers){
        this.numbers = numbers;
    }
    public double sumNum() {
        double sum = 0;
        for (T num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

}
