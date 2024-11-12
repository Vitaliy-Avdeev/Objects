public class Book {
    private String bookName;
    private Author nameAuthor;
    private int yearPublication;

    public Book(String bookName, Author nameAuthor, int yearPublication) {
        this.bookName = bookName;
        this.nameAuthor = nameAuthor;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return this.bookName;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;

    }
}
