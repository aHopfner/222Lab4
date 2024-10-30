//Creator: Designate a class to handle the creation of objects, promoting clear ownership.
//Controller: Use a class to manage the flow of control in the system, acting as a mediator.


//	Manage the catalog of books and members.
//	Track which books are borrowed and available
package Library;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	private ArrayList<Book> catalog = new ArrayList<>();
    private HashMap<String, Member> members = new HashMap<>();
    private int ID = 1;
    //private ArrayList<Book> borrowedBooks;

	public Library() {}

    /**
     *
     * @param title - title of the book
     * @param author - author of the book
     */
    public void createBook(String title, String author){
        Book book = new Book(title, author);
        catalog.add(book);
        //TODO: Handle cases where a book with the same title is already in the system
        //Book.available() maybe? keep track of how many of the same books are available
    }
    
    public void removeMember(Member member) {
    	
    	for(Book b : member.borrowedBooks) {
    		b.setAvailablity();
    		catalog.add(b);
    	}
    	
    	if(members.containsKey(member.getName())) {
    		members.remove(member.getName());
    	}
    }

    /**
     * Prints out books available.
     */
    public void getAvailableBooks(){
        for(Book book : catalog){
            if(book.isAvailable()){
                System.out.println(book.getTitle() + " is available!");
            }
        }
    }
    
    /**
     * 
     * @param title - title of the book we are looking for
     * @return true if book is found.
     */
    public boolean findBook(String title) {
    	for(Book b : catalog) {
    		if(b.getTitle().contains(title)) {
    			System.out.println("Found " + b.toString());
    			return true;
    		}
    	}
    	return false;
    }

    /**
     *
     * @param name - the name of the member being created
     *
     *             ID will auto-increment when creating a member
     *
     *             A hashmap is used to store members,
     *             Key - member name
     *             Value - member object
     */
    public void createMember(String name){
        Member member = new Member(name, ID++);
        members.put(name, member);
        System.out.println("Member:" + member.getName() + " With ID: " + member.getMemberID() + ". Created.");
    }
    //returns member object based on name
    public Member getMember(String name){
        return members.get(name);
    }
    //returns book object based on title
    public Book getBook(String title){
        for(Book b : catalog) {
            if(b.getTitle().contains(title)) {
                return b;
            }
        }
        return null;
    }

    public void printMembers(){
        for(Member member : members.values()) {
            System.out.println(member.toString());
        }
    }
    public void printCatalog() {
    	for(Book b : catalog) {
    		System.out.println(b.toString());
    	}
    }

}
