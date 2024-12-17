package Day17;

public class s2 {
	 public static void main(String[] args) {
	        // Declare and initialize a string
	        String myString = " Hello, World! ";
	        
	        // Print the string
	        System.out.println(myString);
	        
	        // Get the length of the string     
	        System.out.println("Length of the string: " + myString.length());
	        
	        // Convert to upper case
	        String upperCase = myString.toUpperCase();
	        System.out.println("Upper case: " + upperCase);
	        
	        // Convert to lower case
	        String lowerCase = myString.toLowerCase();
	        System.out.println("Lower case: " + lowerCase);
	        
	        // Trim the string whitespace from starting and end
	        String trimmedString = myString.trim();	        
	        System.out.println("Trimmed string: " + trimmedString);
	        
	        // Get a substring from index 0 to 5
	        String substring = myString.substring(0, 5);	        
	        System.out.println("Substring: " + substring);
	        
	        // Replace "World" with "Java"
	        String replacedString = myString.replace("World", "Java");  
	        System.out.println("Replaced string: " + replacedString);
	        
	        // Check if the string contains "World"
	        boolean contains = myString.contains("World");
	        System.out.println("Contains 'World': " + contains);
	        
	        System.out.println(myString.startsWith("He"));//true    
	        System.out.println(myString.endsWith("! "));//true
	        System.out.println(myString.charAt(5));//,   
	        
	        String firstName = "John";
	        String lastName = "Doe";
	        
	        // Concatenate strings using +
	        String fullName = firstName + " " + lastName;
	        
	        System.out.println("Full Name: " + fullName);
	    }
	}