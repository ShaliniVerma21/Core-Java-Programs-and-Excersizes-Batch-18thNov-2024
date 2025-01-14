package Day23;
/*
 5. Non-static Inner Class: Book and Author
Problem: Create a Book class with an inner class Author to manage book authors. 
 */
class Book {
    private String title;

    class Author {
        private String name;

        Author(String name) {
            this.name = name;
        }

        void display() {
            System.out.println("Book: " + title + ", Author: " + name);
        }
    }

    Book(String title) {
        this.title = title;
    }
}

public class p13{
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        Book.Author author = book.new Author("Alice");
        author.display(); // Output: Book: Java Programming, Author: Alice
    }
}