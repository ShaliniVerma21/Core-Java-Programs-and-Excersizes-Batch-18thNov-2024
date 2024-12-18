package Day18;
//Concept 1: Basic Garbage Collection
public class demo8 {
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
	        // Creating objects
	        SampleObject obj1 = new SampleObject("Object 1");
	        SampleObject obj2 = new SampleObject("Object 2");

	        // Nullifying references to make objects eligible for garbage collection
	        obj1 = null; // Object 1 is now eligible for garbage collection
	        obj2 = null; // Object 2 is now eligible for garbage collection

	        // Suggesting JVM to run garbage collector
	        System.gc(); // Requesting garbage collection

	        // Printing a message to indicate the end of the main method
	        System.out.println("End of main method.");
	    }
	}