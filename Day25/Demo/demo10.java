package Day25.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 14. LinkedList
Definition: A LinkedList is a doubly linked list implementation of the 
List and Deque interfaces.

Properties:

Allows null values.
Not synchronized.
Can be used as a list or a queue. 

In Java, both Comparable and Comparator are interfaces used for sorting 
objects, but they serve different purposes and are used in different 
contexts.

Comparable
Definition: The Comparable interface is used to define the natural ordering 
of objects of a class. A class that implements Comparable must override 
the compareTo() method, which compares the current object with another 
object of the same type.

Key Points:

It is used to define a default sorting order for the objects of a class.
The class itself must implement the Comparable interface.
It can only sort objects of the same class.

 */
class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implementing the compareTo method
    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // Sort by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class demo10{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        Collections.sort(people); // Sorts using compareTo
        System.out.println(people);
    }
}