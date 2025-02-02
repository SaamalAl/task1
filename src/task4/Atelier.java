package task4;

public class Atelier {
    public void ToDressWoman(Clothes[] clothes){
        System.out.println("женская одежда: ");
        for(Clothes item : clothes){
            if(item instanceof Womanclo){
                ((Womanclo)item).ToDressWoman();
            }
        }
    }
    public void ToDressMan(Clothes[] clothes){
        System.out.println("мужская одежда: ");
        for(Clothes item : clothes){
            if(item instanceof  Manclo){
                ((Manclo)item).ToDressMan();
            }
        }
    }
}
