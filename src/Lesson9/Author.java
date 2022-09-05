package Lesson9;

public class Author {
    private String authorFirstName;
    private String authorSurname;

    public Author (String authorFirstName, String authorSurname) {
        this.authorFirstName = authorFirstName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {return this.authorFirstName+" " + this.authorSurname;}

}
