package lesson12;

public class Book {
    private String title;
    private Author nameAuthor;
    private int yearPublication;

    public Book(String title, Author nameAuthor, int yearPublication){
        this.title = title;
        this.nameAuthor = nameAuthor;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return this.title;
    }
    public Author getNameAuthor() {
        return this.nameAuthor;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
