package Library;

public class LibraryApp {
    public static void main(String[] args) {
        //Instantiate Creator
        Library lib = new Library();
        LibrarianController libc = new LibrarianController();
        //Members
        System.out.println();
        System.out.println("---Creating members---");
        System.out.println();
        lib.createMember("Alex");
        lib.createMember("Daunte");
        lib.createMember("Gursheen");
        //getting references to member objects
        Member alex = libc.getMember(lib,"Alex");
        Member daunte = libc.getMember(lib,"Daunte");
        Member gursheen = libc.getMember(lib,"Gursheen");

        System.out.println();
        System.out.println("---Printing all members---");
        System.out.println();
        lib.printMembers();

        //Books
        lib.createBook("Dune", "Frank Herbert");
        lib.createBook("Moby Dick", "Herman Melville");
        lib.createBook("1984", "George Orwell");
        //getting references to book objects
        Book dune = libc.getBook(lib,"Dune");
        Book mobyDick = libc.getBook(lib,"Moby Dick");
        Book nineteen = libc.getBook(lib,"1984");
        System.out.println();
        System.out.println("---Printing all books---");
        System.out.println();
        libc.printCatalog(lib);

        //borrowing and returning
     
        System.out.println();
        System.out.println("---Borrowing and returning books---");
        System.out.println();
        libc.borrowBook(alex, dune);
        libc.printCatalog(lib);
        System.out.println();
        libc.returnBook(alex, dune);
        libc.printCatalog(lib);

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
        libc.getAvailableBooks(lib);
        
        libc.removeMember(lib,daunte);
        libc.getAvailableBooks(lib);

    }
}
