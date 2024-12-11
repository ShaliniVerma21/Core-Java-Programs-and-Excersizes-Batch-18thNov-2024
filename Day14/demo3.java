package Day14;

/*
 Dynamic method dispatch is a feature that allows the correct method to be called at runtime, 
 based on the type of object being referred to. This means that the correct method is called 
 based on the actual object being referred to, rather than the type of the reference 
 variable. 
 */

// example of dynamic method dispatch in Java

class Animal1 {
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}
 class Dog1 extends Animal1 {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}
 class Cat1 extends Animal1 {
	    @Override
	    public void sound() {
	        System.out.println("The cat barks");
	    }
	}

public class demo3 {
    public static void main(String[] args) {
    	Animal1 animal;
    	
        animal = new Dog1();
        animal.sound(); // Output: The dog barks
        
        animal = new Cat1();
        animal.sound();
    }
}