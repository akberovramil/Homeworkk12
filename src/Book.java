import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearOfRelease;

    public Book(String name, Author authorName, int yearOfRelease) {
        this.name = name;
        this.author = authorName;
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    @Override
    public String toString() {
        return "Название книги: " + name + " Автор: " + author.toString() + " Год издания: " + yearOfRelease;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfRelease == book.yearOfRelease && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfRelease);
    }






}


