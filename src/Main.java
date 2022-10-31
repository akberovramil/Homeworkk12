import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("�����", "�������");
        Book bookOne = new Book("�����", authorOne, 1999);
        Author authorTwo = new Author("���", "�������");
        Book bookTwo = new Book("����� � ���", authorTwo, 1873);
        Book bookThird = new Book("����� � ���", authorTwo, 1873);
        System.out.println(bookTwo.toString());
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
        System.out.println(authorOne.getName());
    }
}
