package Day16;
/*
Object Cloning : 
Cloning allows you to create a copy of an object. 
In Java, this is done using the clone() method, which is part of the Object class.
*/
class Book implements Cloneable {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class A16{
    public static void main(String[] args) {
        try {
            Book originalBook = new Book("Java Programming");
            Book clonedBook = (Book) originalBook.clone(); // Cloning the original book

            System.out.println("Original Book Title: " + originalBook.title);
            System.out.println("Cloned Book Title: " + clonedBook.title);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}