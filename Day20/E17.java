package Day20;
/*
 The throws keyword is used to declare exceptions that can be thrown 
 by a method. It's like saying, "Hey, this method might throw 
 an exception, so be prepared to handle it!"
 */
public class E17{
	  public static void main(String[] args) {
	    try {
	      printElement(new int[] {1, 2, 3}, 10);
	    } catch (ArrayIndexOutOfBoundsException e) {
	      System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
	    }
	  }

	  public static void printElement(int[] arr, int index) throws ArrayIndexOutOfBoundsException {
	    if (index < 0 || index >= arr.length) {
	      throw new ArrayIndexOutOfBoundsException("Index out of bounds!");
	    }
	    System.out.println("Element: " + arr[index]);
	  }
	}