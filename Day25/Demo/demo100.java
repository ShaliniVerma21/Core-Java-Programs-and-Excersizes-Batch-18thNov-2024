package Day25.Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
/*
 

Comparator
Definition: The Comparator interface is used to define multiple sorting 
orders for objects of a class. It is a separate class that implements 
the Comparator interface and overrides the compare() method.

Key Points:

It is used when you want to define multiple sorting strategies for a class.
The class does not need to implement the Comparator interface.
It can sort objects of different classes or the same class in different 
ways. 
 */
class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class AgeComparator implements Comparator<Person1> {
    @Override
    public int compare(Person1 p1, Person1 p2) {
        return p1.age - p2.age; // Sort by age
    }
}

class NameComparator implements Comparator<Person1> {
    @Override
    public int compare(Person1 p1, Person1 p2) {
        return p1.name.compareTo(p2.name); // Sort by name
    }
}

public class demo100{
    public static void main(String[] args) {
        List<Person1> people = new ArrayList<>();
        people.add(new Person1("Alice", 30));
        people.add(new Person1("Bob", 25));
        people.add(new Person1("Charlie", 35));

        // Sort by age using AgeComparator
        Collections.sort(people, new AgeComparator());
        System.out.println("Sorted by age: " + people);

        // Sort by name using NameComparator
        Collections.sort(people, new NameComparator());
        System.out.println("Sorted by name: " + people);
    }
}