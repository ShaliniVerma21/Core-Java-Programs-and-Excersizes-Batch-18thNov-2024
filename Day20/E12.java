package Day20;
/*
 Unchecked Exceptions:
 
 These exceptions are not checked at compile-time and occur at runtime. 
 They are subclasses of RuntimeException.
 
ArithmeticException: thrown when an arithmetic operation fails, such as division by zero.
NullPointerException: thrown when a null object is used.
ArrayIndexOutOfBoundsException: thrown when an array index is out of bounds.
 */
public class E12 {
		  public static void main(String[] args) {
		    try {
		      int x = 5 / 0; // This will throw an ArithmeticException
		    } catch (ArithmeticException e) {
		      System.out.println("Caught an ArithmeticException: " + e.getMessage());
		    }

		    try {
		      String str = null;
		      System.out.println(str.length()); // This will throw a NullPointerException
		    } catch (NullPointerException e) {
		      System.out.println("Caught a NullPointerException: " + e.getMessage());
		    }

		    try {
		      int[] arr = new int[5];
		      System.out.println(arr[10]); // This will throw an ArrayIndexOutOfBoundsException
		    } catch (ArrayIndexOutOfBoundsException e) {
		      System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
		    }

		    try {
		      Object obj = "Hello";
		      int x = (int) obj; // This will throw a ClassCastException
		    } catch (ClassCastException e) {
		      System.out.println("Caught a ClassCastException: " + e.getMessage());
		    }

		    try {
		      String str = "Hello";
		      int x = Integer.parseInt(str); // This will throw a NumberFormatException
		    } catch (NumberFormatException e) {
		      System.out.println("Caught a NumberFormatException: " + e.getMessage());
		    }
		  }
		}