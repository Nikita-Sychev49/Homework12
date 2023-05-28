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
        System.out.println(warAndPeace);
        printParagraph();
        Author nameAuthor2 = new Author("Евгений", "Онегин");
        Book letterToTatiana = new Book("Письмо Татьяне", nameAuthor2, 1967);
        System.out.println(letterToTatiana);
        printParagraph();

        if (warAndPeace.equals(letterToTatiana)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }


    }
}
