package task4;

public abstract class Clothes {
    protected Size size;
    protected double cost;
    protected String color;

    public Clothes(Size size,double cost,String color){
        this.size=size;
        this.cost=cost;
        this.color=color;
    }

    public String toString(){
        return "size: "+size+"("+size.getDescription()+","+size.getEuroSize()+"),cost: "+cost+"com. Color: "+color;
    }

    public abstract void ToDressWoman();
}
