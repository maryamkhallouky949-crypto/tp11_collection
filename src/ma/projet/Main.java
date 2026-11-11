
package ma.projet;

public class Main {

    public static void main(String[] args) {

        
        Library lib = new Library();

       
        Book b1 = new Book(
                "978-212345603",
                "Java Avance",
                "Auteur A"
        );

        Book b2 = new Book(
                "978-2123456804",
                "Python Debutant",
                "Auteur B"
        );

        Book b3 = new Book(
                "978-2123456805",
                "Programmation C++",
                "Auteur C"
        );

     
        System.out.println(" AJOUT DES LIVRES ");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        
        System.out.println();

        lib.displayBooks();

       
        System.out.println();

        lib.addCategory("Informatique");
        lib.addCategory("Programmation");
        lib.addCategory("Science");
        lib.addCategory("Informatique");

        lib.displayCategories();

        
        System.out.println(" RECHERCHE PAR ISBN ");

        Book found = lib.findByIsbn("978-2123456803");

        if (found != null) {
            System.out.println("Livre trouvé : " + found);
        } else {
            System.out.println("Livre introuvable !");
        }

        
        System.out.println(" EMPRUNT ");

        lib.borrowBook(b1, "Alice");

        
        lib.borrowBook(b1, "Ahmed");

     
        lib.borrowBook(b2, "Sara");

        
        System.out.println();

        lib.displayLoans();

       
        System.out.println(" RESTITUTION ");

        lib.returnBook(b1);

       
        System.out.println(" NOUVEL EMPRUNT ");

        lib.borrowBook(b1, "Ahmed");

        
        System.out.println();

        lib.displayLoans();

      
        System.out.println("Nombre total de livres : "
                + lib.getBookCount());
    }
}
