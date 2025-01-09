package Day22_Remaing;
/*
 2. Static vs Dynamic Binding
Definition:

Static Binding: 
Also known as early binding, it occurs at compile time. 
It is used for method calls that are resolved at compile time, such as private, static, 
and final methods.

Dynamic Binding: 
Also known as late binding, it occurs at runtime. It is used for method calls that are 
resolved at runtime, typically involving overridden methods in inheritance. 
 */
class Animal {
    // Static binding
    static void staticMethod() {
        System.out.println("Static method in Animal");
    }

    // Dynamic binding
    void dynamicMethod() {
        System.out.println("Dynamic method in Animal");
    }
}

class Dog extends Animal {
    // Overriding dynamic method
    void dynamicMethod() {
        System.out.println("Dynamic method in Dog");
    }
}

public class demo2 {
    public static void main(String[] args) {
        Animal animal = new Dog();

        // Static binding (resolved at compile time)
        Animal.staticMethod(); // Output: Static method in Animal

        // Dynamic binding (resolved at runtime)
        animal.dynamicMethod(); // Output: Dynamic method in Dog
    }
}