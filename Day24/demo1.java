package Day24;
//1. ArrayList Example: Managing a Shopping List
// Arraylist can contain duplicate items & maintains Insertion order 
// and it is non-synchronized

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class demo1 {
 public static void main(String[] args) {
     // Create an ArrayList to store shopping items
     ArrayList<String> shoppingList = new ArrayList<>();
     
     // Add items to the shopping list
     shoppingList.add("Milk");
     shoppingList.add("Milk");
     shoppingList.add("Eggs");
     shoppingList.add("Bread");
     shoppingList.add("Butter");
     shoppingList.add("Cheese");
     
     // Display the shopping list
     System.out.println("Shopping List: " + shoppingList);
     
     // Get the size of the shopping list
     System.out.println("Total items in the shopping list: " + shoppingList.size());
     
     // Check if an item is in the list
     System.out.println("Contains Eggs? " + shoppingList.contains("Eggs"));
     
     // Get an item by index
     System.out.println("Item at index 2: " + shoppingList.get(2)); // Bread
     
     // Set a new value at a specific index
     shoppingList.set(2, "Whole Grain Bread");
     System.out.println("Updated Shopping List: " + shoppingList);
     
     // Remove an item by value
     shoppingList.remove("Eggs");
     System.out.println("After removing Eggs: " + shoppingList);
     
     // Remove an item by index
     shoppingList.remove(0); // Removes Milk
     System.out.println("After removing item at index 0: " + shoppingList);
     
     // Get the index of an item
     System.out.println("Index of Butter: " + shoppingList.indexOf("Butter"));
     
     // Clear the shopping list
     shoppingList.clear();
     System.out.println("Shopping List after clearing: " + shoppingList);
     
     // Check if the list is empty
     System.out.println("Is the shopping list empty? " + shoppingList.isEmpty());

     // Re-add items for iteration demonstration
     shoppingList.add("Milk");
     shoppingList.add("Milk");
     shoppingList.add("Eggs");
     shoppingList.add("Bread");
     shoppingList.add("Butter");
     shoppingList.add("Cheese");

     // 1. For Loop
     System.out.println("\nIterating using For Loop:");
     for (int i = 0; i < shoppingList.size(); i++) {
         System.out.println(shoppingList.get(i));
     }

     // 2. Enhanced For Loop (For-Each)
     System.out.println("\nIterating using Enhanced For Loop:");
     for (String item : shoppingList) {
         System.out.println(item);
     }

     // 3. Iterator
     System.out.println("\nIterating using Iterator:");
     Iterator<String> iterator = shoppingList.iterator();
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }

     // 4. ListIterator
     System.out.println("\nIterating using ListIterator:");
     ListIterator<String> listIterator = shoppingList.listIterator();
     while (listIterator.hasNext()) {
         System.out.println(listIterator.next());
     }

     // 5. Stream API (Java 8 and above)
     System.out.println("\nIterating using Stream API:");
     shoppingList.stream().forEach(System.out::println);
 }
}