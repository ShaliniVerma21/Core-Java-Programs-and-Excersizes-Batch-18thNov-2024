package Day14;
//example of method overriding in Java
//2. Runtime polymorphism (it can be achieved via method overriding)

class Animal {
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    /*
     * (Annotation)
     * Annotations in Java are a form of metadata that provide data about a program 
     * but are not part of the program itself. They can be used to give information 
     * to the compiler, to be processed at runtime, or to be used by development tools. 
     * Annotations are a powerful feature in Java that can help in various tasks 
     * such as configuration, documentation, and code analysis.
      
       A. Built-in Annotations: Java provides several built-in annotations, including:
       
       1. @Override: Indicates that a method is overriding a method in a superclass.
       2. @Deprecated: Marks a method or class as deprecated, indicating that it should 
       not be used.
       3. @SuppressWarnings: Instructs the compiler to suppress specific warnings.
       
       B. Custom Annotations: You can create your own annotations to suit your needs.
     */
    public void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}
   
public class demo2 {

	 public static void main(String[] args) {
	        Animal animal = new Animal();
	        animal.sound(); // Output: The animal makes a sound

	        Animal dog = new Dog();
	        dog.sound(); // Output: The dog barks

	        Animal cat = new Cat();
	        cat.sound(); // Output: The cat meows
	    }
	}