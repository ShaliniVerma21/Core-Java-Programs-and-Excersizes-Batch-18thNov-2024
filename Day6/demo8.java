package Day6;

public class demo8 {
	//labled loop example-8
	  public static void main(String[] args) {
	        // Label for the outer loop
	        outerLoop: 
	        for (int i = 0; i < 3; i++) {
	            System.out.println("Outer Loop: " + i);
	            
	            InnerLoop:
	            for (int j = 0; j < 3; j++) {
	                System.out.println("  Inner Loop: " + j);
	                
	                // Condition to break out of the outer loop
	                if (j == 1) {
	                    System.out.println("  Breaking out of the outer loop");
	                    break outerLoop; // This breaks out of the outer loop
	                }
	                break InnerLoop;
	            }
	        }
	        
	        System.out.println("End of program");
	    }
	}