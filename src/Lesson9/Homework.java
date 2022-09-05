package Lesson9;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Hello, amigo!");

        Author levTolstoi = new Author("Лев", "Толстой");
        Author alexPushkin = new Author("Александр", "Пушкин");
        Book warAndPeace = new Book("Война и мир", levTolstoi, 2005);
        Book onegin = new Book("Евгений Онегин", alexPushkin, 2006);
        System.out.println("Книга 1: " + warAndPeace.getBookName() + ". Автор: " + warAndPeace.getAuthorName() + ". Год издания: " + warAndPeace.getPublishYear());
        System.out.println("Книга 2: " + onegin.getBookName() + ". Автор: " + onegin.getAuthorName() + ". Год издания: " + onegin.getPublishYear());

        onegin.setPublishYear(2020);
        System.out.println(onegin.getPublishYear());

    }
}
