public class Book {
    private String title;
    private Author author;
    private int pages;
    private int id;
    private boolean isAvailable = true;

    public Book(String title, Author author, int pages, int id) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", pages=" + pages +
                ", id=" + id +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
