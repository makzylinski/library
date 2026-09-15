public class Book {
    private String title;
    private Author author;
    private int pages;
    private int ISBN;

    public Book(String title, Author author, int pages, int ISBN) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", pages=" + pages +
                ", ISBN=" + ISBN +
                '}';
    }
}
