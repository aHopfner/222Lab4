package Library;

public class LibraryApp {
    public static void main(String[] args) {
        //Instantiate Creator
        Library lib = new Library();
        LibrarianController libc = new LibrarianController(lib);
        //Members
        System.out.println();
        System.out.println("---Creating members---");
        System.out.println();
        lib.createMember("Alex");
        lib.createMember("Daunte");
        lib.createMember("Gursheen");
        //getting references to member objects
        Member alex = libc.getMember("Alex");
        Member daunte = libc.getMember("Daunte");
        Member gursheen = libc.getMember("Gursheen");

        System.out.println();
        System.out.println("---Printing all members---");
        System.out.println();
        lib.printMembers();

        //Books
        lib.createBook("Dune", "Frank Herbert");
        lib.createBook("Moby Dick", "Herman Melville");
        lib.createBook("1984", "George Orwell");
        //getting references to book objects
        Book dune = libc.getBook("Dune");
        Book mobyDick = libc.getBook("Moby Dick");
        Book nineteen = libc.getBook("1984");
        System.out.println();
        System.out.println("---Printing all books---");
        System.out.println();
        libc.printCatalog();

        //borrowing and returning
     
        System.out.println();
        System.out.println("---Borrowing and returning books---");
        System.out.println();
        libc.borrowBook(alex, dune);
        libc.printCatalog();
        System.out.println();
        libc.returnBook(alex, dune);
        libc.printCatalog();

        //Test - two people try to borrow the same book
        System.out.println();
        System.out.println("---TEST: Two members borrow the same book---");
        System.out.println();
        libc.borrowBook(daunte, mobyDick);
        libc.borrowBook(gursheen, mobyDick);

        //Test: print available books
        System.out.println();
        System.out.println("---Printing all available books---");
        System.out.println();
        libc.getAvailableBooks();
        
        libc.removeMember(daunte);
        libc.getAvailableBooks();

    }
}
