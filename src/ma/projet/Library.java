
package ma.projet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Library {

   
    private List<Book> books = new ArrayList<>();

   
    private Set<String> categories = new HashSet<>();

    
    private Map<String, Book> isbnIndex = new HashMap<>();

    private Map<Book, String> loans = new HashMap<>();

    
    public void addBook(Book book) {

        if (!isbnIndex.containsKey(book.getIsbn())) {
            books.add(book);
            isbnIndex.put(book.getIsbn(), book);

            System.out.println("Livre ajouté avec succès !");
        } else {
            System.out.println("Ce livre existe déjà !");
        }
    }

    public void addCategory(String category) {
        categories.add(category);
    }

   
    public void displayCategories() {

        System.out.println("=== CATEGORIES ===");

        for (String category : categories) {
            System.out.println("- " + category);
        }
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    
    public void displayBooks() {

        System.out.println(" LISTE DES LIVRES ");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    
    public Book findByIsbn(String isbn) {
        return isbnIndex.get(isbn);
    }

 
    public boolean borrowBook(Book book, String borrower) {

      
        Book existingBook = isbnIndex.get(book.getIsbn());

        if (existingBook == null) {
            System.out.println("Livre introuvable !");
            return false;
        }

       
        if (loans.containsKey(existingBook)) {
            System.out.println("Livre déjà emprunté !");
            return false;
        }

        loans.put(existingBook, borrower);

        System.out.println("Emprunt effectué par " + borrower);

        return true;
    }

   
    public void returnBook(Book book) {

        Book existingBook = isbnIndex.get(book.getIsbn());

        if (existingBook != null && loans.containsKey(existingBook)) {

            String borrower = loans.remove(existingBook);

            System.out.println("Livre restitué par " + borrower);

        } else {
            System.out.println("Ce livre n'est pas emprunté !");
        }
    }

   
    public void displayLoans() {

        System.out.println(" LIVRES EMPRUNTES ");

        if (loans.isEmpty()) {
            System.out.println("Aucun livre emprunté.");
        }

        for (Map.Entry<Book, String> entry : loans.entrySet()) {

            System.out.println(entry.getKey().getTitle()
                    + " -> Emprunté par "
                    + entry.getValue());
        }
    }

 
    public int getBookCount() {
        return books.size();
    }
}
