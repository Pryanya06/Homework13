import java.util.Objects;

public class Book {
    public boolean toString;
    private String title;
        private Author author;
        private int publishingYear;

        public Book(String title,Author author,int publishingYear) {
            this.title = title;
            this.author = author;
            this.publishingYear = publishingYear;
        }

        public String getTitle() {
            return title;
        }
        public Author getAuthor() {
            return author;
        }
        public int getPublishingYear() {
            return publishingYear;
        }
        public void setPublishingYear(int publishingYear) {
            this.publishingYear = publishingYear;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPublishingYear() == book.getPublishingYear() && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getPublishingYear());
    }

    @Override
    public String toString() {
        return "Book{" +
                "toString=" + toString +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", publishingYear=" + publishingYear +
                '}';
    }
}

