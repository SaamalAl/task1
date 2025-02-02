package task4;

public class Main {
    public static void main(String[] args){
        Clothes[] clothes = {
                new Tshirt(Size.M,1200,"red"),
                new Pants(Size.L,2500,"blue"),
                new Skirt(Size.S,2000,"green"),
                new Tie(Size.XS,800,"black")
        };
        Atelier atelier = new Atelier();
        atelier.ToDressWoman(clothes);
        atelier.ToDressMan(clothes);
    }
}
