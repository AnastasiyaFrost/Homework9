package Lesson9;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    private int publishYear;

    public Book(String bookName, Author authorName, int publishYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }
    public String getBookName() {return this.bookName;}
    public Author getAuthorName() {return this.authorName;}
    public int getPublishYear() {return this.publishYear;}

    public void setPublishYear(int publishYear) {this.publishYear = publishYear;}

    @Override
    public String toString() {
        return "Название: " + bookName +
                ", автор: " + authorName +
                ", год издания: " + publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName);
    }
}
