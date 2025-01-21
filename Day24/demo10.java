package Day24;

//2. LinkedList Example: Implementing a Playlist

/*
Linkedlist Properties---
1. Doubly Linked List: 
Each element (node) contains references to both its previous and next nodes.
2. Duplicates Allowed: Can contain duplicate items.
3. Insertion Order Maintained: Preserves the order of elements as 
they are added.
4. Efficient Insert/Delete: Ideal for frequent additions and deletions.
5. Non-Synchronized: Not thread-safe; must be synchronized externally.
6. Sequential Access: Slower than ArrayList for random access due to traversal 
through nodes. 
 */

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class demo10 {
 public static void main(String[] args) {
     // Create a LinkedList to store songs in a playlist
     LinkedList<String> playlist = new LinkedList<>();
     
     // Add songs to the playlist
     playlist.add("Song A");
     playlist.add("Song B");
     playlist.add("Song C");
     playlist.add("Song D");
     playlist.add("Song E");
     
     // Display the current playlist
     System.out.println("Current Playlist: " + playlist);
     
     // Play the first song
     System.out.println("Now Playing: " + playlist.getFirst());
     
     // Remove the first song after playing
     playlist.removeFirst();
     System.out.println("Updated Playlist after playing first song: " 
     + playlist);
     
     // Add a new song at the beginning
     playlist.addFirst("Song F");
     System.out.println("Playlist after adding Song F at the beginning: " 
     + playlist);
     
     // Add a new song at the end
     playlist.addLast("Song G");
     System.out.println("Playlist after adding Song G at the end: " + playlist);
     
     // Check if a specific song is in the playlist
     System.out.println("Does the playlist contain 'Song B'? " + 
     playlist.contains("Song B"));
     
     // Get the size of the playlist
     System.out.println("Total songs in the playlist: " + playlist.size());
     
     // 1. Iterate using a For Loop
     System.out.println("\nIterating using For Loop:");
     for (int i = 0; i < playlist.size(); i++) {
         System.out.println(playlist.get(i));
     }
     
     // 2. Iterate using Enhanced For Loop (For-Each)
     System.out.println("\nIterating using Enhanced For Loop:");
     for (String song : playlist) {
         System.out.println(song);
     }
     
     // 3. Iterate using an Iterator
     System.out.println("\nIterating using Iterator:");
     Iterator<String> iterator = playlist.iterator();
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
     
     // 4. Iterate using a ListIterator
     System.out.println("\nIterating using ListIterator:");
     ListIterator<String> listIterator = playlist.listIterator();
     while (listIterator.hasNext()) {
         System.out.println(listIterator.next());
     }
     
     // 5. Iterate using Stream API (Java 8 and above)
     System.out.println("\nIterating using Stream API:");
     playlist.stream().forEach(System.out::println);
     
     // Clear the playlist
     playlist.clear();
     System.out.println("Playlist after clearing: " + playlist);
     
     // Check if the playlist is empty
     System.out.println("Is the playlist empty? " + playlist.isEmpty());
 }
}