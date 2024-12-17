package Day17;

public class s7 {
	public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder builder = new StringBuilder("Hello, ");
        
        // Print the initial capacity
        System.out.println("Initial capacity: " + builder.capacity());
        
        // Print the length
        System.out.println("Length: " + builder.length());
        
        // Print the string
        System.out.println("String: " + builder.toString());
        
        // Append a string
        builder.append("World!");
        
        // Print the updated string
        System.out.println("Updated string: " + builder.toString());
        
        // Insert a string at a specific position
        builder.insert(7, "Java ");
        
        // Print the updated string
        System.out.println("Updated string: " + builder.toString());
        
        // Reverse the string
        builder.reverse();
        
        // Print the reversed string
        System.out.println("Reversed string: " + builder.toString());
        
        
    }
}
