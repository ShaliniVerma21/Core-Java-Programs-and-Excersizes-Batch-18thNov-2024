package Day17;

public class s3 {
	 public static void main(String[] args) {
	        String myString = "apple,banana,cherry";
	        
	        // Split the string into an array
	        String[] fruits = myString.split(",");
	        
	        // Print the array elements
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	        
	        String myString1 = " Hello, World!";
	        String myString2 = "Hello, World!";
	        
	        // Check if the two strings are equal
	        boolean equals = myString1.equals(myString2);
	        
	        System.out.println("Strings are equal: " + equals);

	    }
}
