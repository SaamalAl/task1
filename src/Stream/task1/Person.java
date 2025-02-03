package Stream.task1;

public class Person {
    String name;
    int age;
    double salary;

    public Person(String name,int age,int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
}

