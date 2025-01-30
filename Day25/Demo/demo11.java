package Day25.Demo;

import java.util.Vector;

/*
 13. Vector
Definition: A Vector is a dynamic array that can grow as needed to 
accommodate new elements.

Properties:

Synchronized.
Allows duplicate elements.
Legacy class. 

(In Java, a legacy class refers to classes that were part of the original 
version of the Java programming language (Java 1.0) and are still available 
in the Java API. These classes were designed before the introduction of 
the Java Collections Framework (JCF) in Java 2 (Java 1.2). While they are 
still supported for backward compatibility, they are generally considered 
outdated and are often replaced by newer classes that are part of the JCF.
Here are some of the most commonly used legacy classes in Java:Vectors, 
Stack, Hashtable.)

Key Characteristics of Legacy Classes: 

Synchronized: Many legacy classes are synchronized, which means they are 
thread-safe. However, this can lead to performance overhead compared to 
newer, non-synchronized collections.

Non-Generics: Legacy classes do not support generics, which means they 
can store any type of object without type safety. This can lead to 
ClassCastException at runtime.

Limited Functionality: They often lack the rich functionality and 
flexibility provided by the newer collections framework.
 */
public class demo11 {

	public static void main(String[] args) {
		Vector<String> list = new Vector<>();
		
		//add elements
		list.add("Ram");
		list.add("Priya");
		
		System.out.println(list);
	}

}
