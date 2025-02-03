package Stream.task1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Soma",20,15000));
        people.add(new Person("Nurperi",21,20000));
        people.add(new Person("Atai",23,10000));
        people.add(new Person("Erjan",20,25000));
        people.add(new Person("Syimyk",25,30000));

        int totalAge = people.stream().mapToInt(Person::getAge).sum();
        double totalSalary = people.stream().mapToDouble(Person::getSalary).sum();

        System.out.println("сумма возрастов: "+totalAge);
        System.out.println("сумма зарплат: "+totalSalary);

        double averageAge = people.stream().collect(Collectors.averagingInt(Person :: getAge));
        double averageSalary = people.stream().collect(Collectors.averagingDouble(Person :: getSalary));

        System.out.println("средний возраст: "+ averageAge);
        System.out.println("средняя зарплата: "+averageSalary);
    }
}

