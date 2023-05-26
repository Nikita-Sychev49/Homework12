package lesson12;

public class Book {
    private String title;
    private Author Author;
    private int yearPublication;

    public Book(String title, Author Author, int yearPublication) {
        this.title = title;
        this.Author = Author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.Author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
