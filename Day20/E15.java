package Day20;
//nested try catch block and finally
public class E15 {
	  public static void main(String[] args) {
	    try {
	      System.out.println("Outer try block");
	      try {
	        System.out.println("Inner try block");
	        int x = 5 / 0; // This will throw an ArithmeticException
	      } catch (ArithmeticException e) {
	        System.out.println("Caught an ArithmeticException in inner catch block");
	        throw new RuntimeException("Rethrowing exception");
	      }
	    } catch (Exception e) {
	      System.out.println("Caught an exception in outer catch block");
	    } finally {
	      System.out.println("Finally block executed");
	    }
	  }
	}