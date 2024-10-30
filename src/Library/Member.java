//Information Expert: Assign responsibilities to the class that has the needed information to perform them.
//Low Coupling: Minimize dependencies between classes to improve maintainability and flexibility.

//Can borrow and return books.
package Library;

import java.util.ArrayList;

public class Member {
	private String name;
	private int memberID;
	public ArrayList<Book> borrowedBooks = new ArrayList<Book>();

	public Member(String name, int memberID) {
		this.name = name;
		this.memberID = memberID;
	}
	//LibrarianController will only call this if it is available, so we don't need to check if it's available
	public void BorrowBook(Book book) {
		borrowedBooks.add(book);
	}
	public void returnBook(Book book) {
		borrowedBooks.remove(book);
	}
	public String getName() {
		return name;
	}
	public int getMemberID() {
		return memberID;
	}
	public String toString() {
		return "Member " + memberID + ": " + name;
	}
	// DONE: implement collection of borrowed books
	
	// TODO: implement functionality of Member class

}
