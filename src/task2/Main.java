package task2;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        /* System.out.println("любимое время года: "+ season);*/
        switch (season){
            case WINTER :
                System.out.println("холод");
                break;
            case SPRING:
                System.out.println("цветение");
                break;
            case SUMMER:
                System.out.println("я люблю лето");
                break;
            case AUTUMN:
                System.out.println("пасмурно");
            default:
                System.out.println("ошибка");
        }
    }
}

