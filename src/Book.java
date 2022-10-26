public class Book {
    private String name;
    Object author;
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
        return (Author) author;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}

