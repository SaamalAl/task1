package task2;

public enum Season {
    WINTER( -5,"холодное время годла"),
    SPRING(12,"красивое время года"),
    SUMMER( 25,"теплое время года"),
    AUTUMN(10,"дождливое время года");


    public int temp;
    public String description;
    Season( int temp, String description) {

        this.temp = temp;
        this.description = description;
    }



    public int getTemp(){
        return temp;
    }
    public String getDescription(){
        return description;
    }

    public String description() {
        return description;
    }

    public int temp() {
        return temp;
    }
}

