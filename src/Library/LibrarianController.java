//Creator: Designate a class to handle the creation of objects, promoting clear ownership.
package Library;

public class LibrarianController {
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	private Library lib;
	// TODO: implement functionality of LibrarianController class
	public LibrarianController(Library lib){
		this.lib = lib;
	}

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

	public void removeMember(Member member) {
		lib.removeMember(member);
	}
	public void getAvailableBooks() {
		lib.getAvailableBooks();
	}
	public void findBook(String s) {
		lib.findBook(s);
	}
	public Member getMember(String s) {
		return lib.getMember(s);
	}
	public void printMembers() {
		lib.printMembers();
	}
	public void printCatalog() {
		lib.printCatalog();
	}
	public Book getBook(String s) {
		return lib.getBook(s);
	}
	public void removeBook(Book b) {
		lib.removeBook(b);
	}
}
