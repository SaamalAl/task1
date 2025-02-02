package task4;

public class Tie extends Clothes implements Manclo{
    public Tie(Size size,double cost,String color){super(size,cost,color);}

    @Override
    public void ToDressWoman() {

    }

    @Override
    public void ToDressMan() {
        System.out.println("галстук: "+this);
    }


}
