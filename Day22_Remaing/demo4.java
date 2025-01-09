package Day22_Remaing;
/*
 4. Covariant Return Type
Definition: 
Covariant return type allows a method to override a method in a superclass and return a 
subtype of the return type declared in the superclass method. This feature is useful in 
inheritance. 
 */
class Animal2 {
    Animal2 getAnimal2() {
        return new Animal2();
    }
}

class Dog2 extends Animal2 {
    // Covariant return type
    @Override
    Dog2 getAnimal2() {
        return new Dog2();
    }
}

public class demo4{
    public static void main(String[] args) {
        Dog2 Dog2 = new Dog2();
        Animal2 Animal2 = Dog2.getAnimal2(); // Returns a Dog2, but is of type Animal2
        System.out.println("Returned type: " + Animal2.getClass().getSimpleName()); // Output: Dog2
    }
}