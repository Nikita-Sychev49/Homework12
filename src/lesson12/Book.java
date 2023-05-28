package lesson12;

import java.util.Objects;

public class Book {
    private final String title;
    private final Author Author;
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

    @Override
    public String toString() {
        return "Книга - " + title + ": " + "Автор - " + Author + ": " + "Год публикации - " + yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(title, book.title) && Objects.equals(Author, book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, Author, yearPublication);
    }
}
