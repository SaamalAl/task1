package task4;

public class Tshirt extends Clothes implements Manclo,Womanclo{
    public Tshirt(Size size,double cost,String color){
        super(size, cost, color);
    }

    @Override
    public void ToDressMan(){
        System.out.println("мужская футболка:"+this);
    }

    @Override
    public void ToDressWoman(){
        System.out.println("женская футболка:"+this);
    }
}
