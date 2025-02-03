package Set.task910;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();
        Car car1 = new Car("tayota","camry",2020);
        Car car2 = new Car("lexus","lx570",2015);
        Car car3 = new Car("honda","accord",2002);
        Car car4 = new Car("bmw","m3",2018);

        Set<Car> carSet = new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);

        System.out.println("коллекция автомобилей: "+carSet);

        Set<Car> sortedCars = new TreeSet<>(Comparator.comparingInt(car -> car.yearRelease));

        System.out.println("отсортированная коллекция: ");

        for(Car car : sortedCars){
            System.out.println(car);
        }
    }
}
