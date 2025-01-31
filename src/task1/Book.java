package task1;

public abstract class Book implements Edition {
    protected String title;
    protected String author;

    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    @Override
    public abstract void getDescription();
}
