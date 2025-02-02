package task4;

public class Skirt extends Clothes implements Womanclo{
    public Skirt(Size size,double cost,String color){super(size,cost,color);}

    @Override
    public void ToDressWoman(){
        System.out.println("юбка: "+this);
    }
}
