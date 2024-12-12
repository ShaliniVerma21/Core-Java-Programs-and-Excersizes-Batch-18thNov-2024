package Day15;
/*
Constructor overloading is a technique where multiple constructors are defined 
with different parameter lists.

Example 1:
 */
public class C7{
    private String name;
    private int age;

    public C7(String name) {
        this.name = name;
        this.age = 0;
    }

    public C7(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        C7 person1 = new C7("John");
        C7 person2 = new C7("John", 30);

        System.out.println(person1.name); // prints "John"
        System.out.println(person1.age); // prints 0
        System.out.println(person2.name); // prints "John"
        System.out.println(person2.age); // prints 30
    }
}