package task4;

public enum Size {
    XXS(32){
        @Override
        public String getDescription(){return "детский размер";}
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;
    Size(int euroSize){this.euroSize=euroSize;}
    public int getEuroSize(){return euroSize;}
    public String getDescription(){return "взрослый размер";}
}

