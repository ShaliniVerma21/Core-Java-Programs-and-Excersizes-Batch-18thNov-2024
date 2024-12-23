package Day20;
//8. Nested Try-Catch
public class E7 {
	    public static void main(String[] args) {
	        try {
	            try {
	                int[] arr = new int[5];
	                arr[10] = 1; // This will throw ArrayIndexOutOfBoundsException
	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
	            }
	        } catch (Exception e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}