package lesson12;

public class App {
    public static void printParagraph() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void main(String[] args) {
        printParagraph();
        Author nameAuthor1 = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", nameAuthor1, 1964);
        System.out.println("Книга - " + warAndPeace.getTitle() + "\n" + "Автор - " + nameAuthor1.getFirstName() + " " +
                nameAuthor1.getMiddleNameName() + "\n" + "Год публикации - " + warAndPeace.getYearPublication());
        printParagraph();
        Author nameAuthor2 = new Author("Евгений", "Онегин");
        Book letterToTatiana = new Book("Письмо Татьяне", nameAuthor2, 1967);
        System.out.println("Книга - " + letterToTatiana.getTitle() + "\n" + "Автор - " + nameAuthor2.getFirstName() + " " +
                nameAuthor2.getMiddleNameName() + "\n" + "Год публикации - " + letterToTatiana.getYearPublication());
        printParagraph();
        letterToTatiana.setYearPublication(1980);
        System.out.println("Изменили год на " + letterToTatiana.getYearPublication());
    }

}
