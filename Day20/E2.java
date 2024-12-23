package Day20;
//3. Finally Block Example
public class E2 {
	   public static void main(String[] args) {
	        try {
	            System.out.println("Inside try block");
	        } catch (Exception e) {
	            System.out.println("Exception caught");
	        } finally {
	            System.out.println("This will always execute");
	        }
	    }
	}
