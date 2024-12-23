package Day20;
//6. Throwing Exceptions
public class E5 {
	    public static void checkNumber(int number) {
	        if (number < 1) {
	            throw new IllegalArgumentException("Number must be greater than 0");
	        }
	        System.out.println("Number is: " + number);
	    }

	    public static void main(String[] args) {
	        try {
	            checkNumber(0);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Caught exception: " + e.getMessage());
	        }
	    }
	}