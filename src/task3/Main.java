package task3;


import task3.Season;

public class Main {
    public static void main(String[] args) {

        for (Season season : Season.values()){
            System.out.println("температура: "+ season.temp());
            System.out.println("описание:"+ season.description());
        }
    }
}


