package task1;

public class Reference extends Book{
    protected String title;
    protected String author;

    public Reference(String title,String author){
        super(title,author);
    }

    public void getDescription(){
        System.out.println("справочник "+title+"автора "+author);
    }
}
