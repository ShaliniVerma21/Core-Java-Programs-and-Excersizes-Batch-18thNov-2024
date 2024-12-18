package Day18;
//Concept 2: Garbage Collection with Object References
public class demo9 {
	    // A simple class to demonstrate garbage collection
	    static class SampleObject {
	        String name;

	        SampleObject(String name) {
	            this.name = name;
	        }

	        // Override finalize method to see when the object is garbage collected
	        @Override
	        protected void finalize() {
	            System.out.println(name + " is being garbage collected.");
	        }
	    }

	    public static void main(String[] args) {
	        // Creating an object
	        SampleObject obj = new SampleObject("Object 1");

	        // The object is still reachable, so it won't be garbage collected
	        System.out.println("Created: " + obj.name);

	        // Suggesting JVM to run garbage collector
	        System.gc(); // Requesting garbage collection

	        // The object is still reachable, so it won't be garbage collected
	        System.out.println("After requesting garbage collection, " + obj.name + " is still reachable.");

	        // Now nullifying the reference
	        obj = null; // Now the object is eligible for garbage collection

	        // Suggesting JVM to run garbage collector again
	        System.gc(); // Requesting garbage collection

	        // Printing a message to indicate the end of the main method
	        System.out.println("End of main method.");
	    }
	}