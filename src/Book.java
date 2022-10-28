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


    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    public String toString(){
        return name + " " + author + " "  + yearOfRelease;
    }



    }


