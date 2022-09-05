package Lesson9;

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
}
