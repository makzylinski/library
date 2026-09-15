public class Book {
    private String title;
    private Author author;
    private int pages;
    private int id;

    public Book(String title, Author author, int pages, int id) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", pages=" + pages +
                ", id=" + id +
                '}';
    }
}
