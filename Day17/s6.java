package Day17;

public class s6 {
	 public static void main(String[] args) {
	        // Create a StringBuffer
	        StringBuffer buffer = new StringBuffer("Hello, ");
	        
	        // Print the initial capacity
	        System.out.println("Initial capacity: " + buffer.capacity());
	        
	        // Print the length
	        System.out.println("Length: " + buffer.length());
	        
	        // Print the string
	        System.out.println("String: " + buffer.toString());
	        
	        // Append a string
	        buffer.append("World!");
	        
	        // Print the updated string
	        System.out.println("Updated string: " + buffer.toString());
	        
	        // Insert a string at a specific position
	        buffer.insert(7, "Java ");
	        
	        // Print the updated string
	        System.out.println("Updated string: " + buffer.toString());
	        
	        // Reverse the string
	        buffer.reverse();
	        
	        // Print the reversed string
	        System.out.println("Reversed string: " + buffer.toString());
	   
	    }
}
