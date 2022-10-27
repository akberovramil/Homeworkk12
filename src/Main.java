import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Joanne", "Rowling");
        Book bookOne = new Book("Harry Potter", authorOne.getName(), 1999);
        Author authorTwo = new Author("Lev", "Tolstoy");
        Book bookTwo = new Book("Voina i mir", authorTwo.getName(), 1873);
        bookOne.setYearOfRelease(1996);
        System.out.println(bookOne.getYearOfRelease());
        System.out.println(" ");
        System.out.println(authorOne.toString());





    }
}
