package Lesson10;

import Lesson9.Author;
import Lesson9.Book;

public class Homework10 {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев", "Толстой");
        Author alexPushkin = new Author("Александр", "Пушкин");
        Book warAndPeace = new Book("Война и мир", levTolstoi, 2005);
        Book onegin = new Book("Евгений Онегин", alexPushkin, 2006);

        System.out.println(onegin);
        System.out.println(warAndPeace);
        System.out.println(levTolstoi);
        System.out.println(alexPushkin);

        System.out.println(levTolstoi.equals(alexPushkin));
        Author levNicolaevichTolstoi = new Author("Лев", "Толстой");
        System.out.println(levTolstoi.equals(levNicolaevichTolstoi));
    }
}
