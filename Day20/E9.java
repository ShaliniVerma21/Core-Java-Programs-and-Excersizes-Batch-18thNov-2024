package Day20;
//10. Final vs Finally vs Finalize
public class E9 {
	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("Finalize method called");
	    }

	    public static void main(String[] args) {
	        E9 obj = new E9();
	        obj = null; // Make the object eligible for garbage collection
	        System.gc(); // Request garbage collection
	        System.out.println("Garbage collection requested");
	    }
	}