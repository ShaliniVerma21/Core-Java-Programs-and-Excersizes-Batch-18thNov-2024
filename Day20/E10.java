package Day20;
//2. Multiple Catch Blocks
public class E10 {
	   public static void main(String[] args) {
	        try {
	            String str = null;
	            System.out.println(str.length()); // This will throw NullPointerException
	        } 
	        catch (NullPointerException e) {
	            System.out.println("Null pointer exception: " + e.getMessage());
	        } 
	        catch (Exception e) {
	            System.out.println("An exception occurred: " + e.getMessage());
	        }
	    }
	}