public class Book {
    private String name;
    private String author;
    private int yearOfRelease;

    public Book(String name, String authorName, int yearOfRelease) {
        this.name = name;
        this.author = authorName;
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


    }


