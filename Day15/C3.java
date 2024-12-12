package Day15;
/*
Constructor chaining is a technique where a constructor calls another constructor 
in the same class using the this keyword.

Example 1:
 */

class C3Person {
    String name;
    int age;

    public C3Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public C3Person(String name) {
        this(name, 0); // calls the other constructor
    }
}
public class C3 {
    public static void main(String[] args) {
        C3Person C3Person = new C3Person("John");
        System.out.println(C3Person.name); // prints "John"
        System.out.println(C3Person.age); // prints 0
    }
}
