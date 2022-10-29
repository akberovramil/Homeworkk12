import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Joanne", "Rowling");
        Book bookOne = new Book("Harry Potter", authorOne, 1999);
        Author authorTwo = new Author("Lev", "Tolstoy");
        Book bookTwo = new Book("Voina i mir", authorTwo, 1873);
        Book bookThird = new Book("Voina i mir", authorTwo, 1873);
        bookOne.setYearOfRelease(1996);
        System.out.println(bookOne.getYearOfRelease());
        System.out.println(" ");
        System.out.println(authorOne.toString());
        System.out.println(authorTwo.toString());
        System.out.println(authorOne.equals(authorTwo));
        System.out.println(bookOne.toString());
        System.out.println(bookOne.equals(bookTwo));
        System.out.println(bookTwo.equals(bookThird));
        System.out.println(bookTwo.hashCode());
        System.out.println(bookThird.hashCode());
        System.out.println(bookOne.equals(authorTwo));

        





    }
}
