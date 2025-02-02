package task4;

public class Pants extends Clothes implements Manclo,Womanclo {
    public Pants(Size size,double cost,String color){super(size,cost,color);}

    @Override
    public void ToDressMan(){
        System.out.println("мужские штаны: "+this);
    };

    @Override
    public void ToDressWoman(){
        System.out.println("женские штаны");
    }
}
