//Creator: Designate a class to handle the creation of objects, promoting clear ownership.
package Library;

public class LibrarianController {
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.

	// TODO: implement functionality of LibrarianController class
	public void borrowBook(Member m, Book b){
		if(b.isAvailable()){
			b.setAvailablity();
			m.BorrowBook(b);
			System.out.println(m.getName() + " borrowed " + b.getTitle());
		}else{
			System.out.println("Sorry " + m.getName() + "! " + b.getTitle() + " is not available.");
		}
	}
	public void returnBook(Member m, Book b){
		m.returnBook(b);
		b.setAvailablity();
		//this will ensure the book is available (isAvailable == True) when it's returned
		if(b.isAvailable()){
			System.out.println(b.getTitle() + " was returned by " + m.getName() + ".");
		}else{
			b.setAvailablity();
		}
	}

	public void removeMember(Library lib, Member member) {
		lib.removeMember(member);
	}
	public void getAvailableBooks(Library lib) {
		lib.getAvailableBooks();
	}
	public void findBook(Library lib, String s) {
		lib.findBook(s);
	}
	public Member getMember(Library lib, String s) {
		return lib.getMember(s);
	
	}
	public void printMembers(Library lib) {
		lib.printMembers();
	}
	public void printCatalog(Library lib) {
		lib.printCatalog();
	}
	public Book getBook(Library lib, String s) {
		return lib.getBook(s);
	}
}
