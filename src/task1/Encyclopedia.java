package task1;

public class Encyclopedia extends Book{
    protected String title;
    protected String author;

    public Encyclopedia(String title,String author){
        super(title,author);
    }

    public void getDescription(){
        System.out.println("энциклопедия "+title+"автора"+author);
    }

}
