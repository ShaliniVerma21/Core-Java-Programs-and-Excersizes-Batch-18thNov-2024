package Day25.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 15. ArrayList
Definition: An ArrayList is a resizable array implementation of the List 
interface.

Properties:

Allows duplicate elements.
Not synchronized.
Provides fast random access. 
 */

/*
 Synchronized vs. Non-Synchronized Collections in Java 
 
Synchronized Collections

Synchronized collections are thread-safe, meaning they can be safely 
accessed by multiple threads at the same time without causing data 
inconsistency or corruption. This is achieved by using synchronization 
mechanisms.

Non-Synchronized Collections

Non-synchronized collections are not thread-safe, meaning they can be 
accessed by multiple threads simultaneously, which can lead to data 
inconsistency or corruption if not handled properly.

Key Differences

1. Thread Safety:

Synchronized: Safe for concurrent access by multiple threads.
Non-Synchronized: Not safe for concurrent access; can lead to data 
corruption.

2. Performance:

Synchronized: Slower due to the overhead of synchronization.
Non-Synchronized: Faster as there is no synchronization overhead.

3. Usage:

Synchronized: Use when multiple threads will access the collection 
simultaneously.
Non-Synchronized: Use when only one thread will access the collection or
 when you manage synchronization manually.
 */
public class demo1 {
	public static void main(String[] args) {
        // Create a non-synchronized ArrayList
        List<String> list = new ArrayList<>();
        
        // Wrap it with Collections.synchronizedList to make it synchronized
        List<String> synchronizedList = Collections.synchronizedList(list);
         
        // Adding elements to the synchronized list
        synchronizedList.add("One");
        synchronizedList.add("Two");
        
        // Accessing elements in a synchronized way
        synchronized (synchronizedList) {
            for (String item : synchronizedList) {
                System.out.println(item);
            }
        }
        
        // Create a non-synchronized ArrayList
        List<String> list1 = new ArrayList<>();
        
        // Adding elements to the non-synchronized list
        list1.add("One");
        list1.add("Two");
        
        // Accessing elements without synchronization
        for (String item : list1) {
            System.out.println(item);
        }
    }
}