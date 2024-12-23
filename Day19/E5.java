package Day19;
//Encapsulation in real world applications
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Book is available by default
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Method to check availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow the book
    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently not available.");
        }
    }

    // Method to return the book
    public void returnBook() {
        isAvailable = true;
        System.out.println("You have returned: " + title);
    }
}

class Member {
    private String name;
    private List<Book> borrowedBooks;

    public Member(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
            borrowedBooks.add(book);
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    // Method to return a book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println("You did not borrow this book.");
        }
    }

    // Method to list borrowed books
    public void listBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println("- " + book.getTitle());
        }
    }
}
class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    // Method to add a member to the library
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Added member: " + member.getName());
    }

    // Method to list all books
    public void listBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " (Available: " + book.isAvailable() + ")");
        }
    }
}
public class E5 {
	  public static void main(String[] args) {
	        // Create a library
	        Library library = new Library();

	        // Create books
	        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
	        Book book2 = new Book("1984", "George Orwell");
	        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

	        // Add books to the library
	        library.addBook(book1);
	        library.addBook(book2);
	        library.addBook(book3);

	        // Create members
	        Member member1 = new Member("Alice");
	        Member member2 = new Member("Bob");

	        // Add members to the library
	        library.addMember(member1);
	        library.addMember(member2);

	        // List all books in the library
	        library.listBooks();

	        // Members borrow books
	        member1.borrowBook(book1);
	        member2.borrowBook(book2);

	        // List borrowed books for each member
	        member1.listBorrowedBooks();
	        member2.listBorrowedBooks();

	        // Attempt to borrow an unavailable book
	        member1.borrowBook(book1); // Should indicate that the book is not available

	        // Members return books
	        member1.returnBook(book1);
	        member2.returnBook(book2);

	        // List all books again to see updated availability
	        library.listBooks();
	    }
	}