
package ma.projet;

import java.util.Objects;

public class Book {

    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    
    @Override
    public String toString() {
        return "Livre [ISBN=" + isbn
                + ", Titre=" + title
                + ", Auteur=" + author + "]";
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Book)) {
            return false;
        }

        Book other = (Book) obj;

        return Objects.equals(isbn, other.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
