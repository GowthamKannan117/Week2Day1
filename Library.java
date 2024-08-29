package week2.Day1;

public class Library {

	public String addBook(String bookTitle) {
		// TODO Auto-generated method stub
		System.out.println(bookTitle+ " " + "Book Added Successfully");
return bookTitle;
	}
 public void issueBook() {
	System.out.println("Book Issued Successfully");
}
 public static void main(String[] args) {
	Library lib = new Library();
	lib.addBook("Sherlock Holmes");
	lib.issueBook();
	
}
}
