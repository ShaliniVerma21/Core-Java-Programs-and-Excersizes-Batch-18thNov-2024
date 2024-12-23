package Day20;
/*
 The throw keyword is used to explicitly throw an exception 
 from a method or a block of code. It's like saying, 
 "Hey , something went wrong, and I'm going to throw an exception!"
 */
public class E16{
	  public static void main(String[] args) {
	    try {
	      divide(10, 0);
	    } catch (ArithmeticException e) {
	      System.out.println("Caught exception: " + e.getMessage());
	    }
	  }

	  public static void divide(int a, int b) {
	    if (b == 0) {
	      throw new ArithmeticException("Cannot divide by zero!");
	    }
	    int result = a / b;
	    System.out.println("Result: " + result);
	  }
	}