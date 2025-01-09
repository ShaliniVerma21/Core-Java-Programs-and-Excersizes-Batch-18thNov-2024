package Day22_Remaing;
/*
 5. Garbage Collection
Definition: 
Garbage collection is the process of automatically identifying and reclaiming memory that 
is no longer in use by the program. In Java, the garbage collector runs in the background 
to free up memory by removing objects that are no longer reachable.
 */
public class demo5 {
    public static void main(String[] args) {
        // Creating an object
        String str = new String("Hello, World!");

        // Nullifying the reference
        str = null; // The object is now eligible for garbage collection

        // Suggesting the JVM to run garbage collection
        System.gc(); // This is just a suggestion; the JVM may not run it immediately

        System.out.println("Garbage collection has been requested.");
    }
}