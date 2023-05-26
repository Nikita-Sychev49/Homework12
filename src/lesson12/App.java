package lesson12;

public class App {
    public static void printParagraph() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void printBookInfo(Book book, Author author) {
        System.out.println("Книга - " +book.getTitle()+ "\n" + "Автор - " + book.getAuthor().getFirstName() + " "
                +book.getAuthor().getMiddleNameName()+ "\n" + "Год публикации - " + book.getYearPublication());
    }

    public static void main(String[] args) {
        printParagraph();
        Author nameAuthor1 = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", nameAuthor1, 1964);
        printBookInfo(warAndPeace, nameAuthor1);
        printParagraph();
        Author nameAuthor2 = new Author("Евгений", "Онегин");
        Book letterToTatiana = new Book("Письмо Татьяне", nameAuthor2, 1967);
        printBookInfo(letterToTatiana, nameAuthor2);
        printParagraph();
        letterToTatiana.setYearPublication(1980);
        System.out.println("Изменили год публикации 'Письмо татьяне' на " + letterToTatiana.getYearPublication());
    }

}
