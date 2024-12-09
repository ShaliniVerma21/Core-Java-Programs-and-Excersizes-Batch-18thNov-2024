package Day12;

class parent1{
	int value = 10;
	 parent1() {
	        System.out.println("Parent class constructor");
	    }
	 void display() {
	        System.out.println("Display from Parent class");
	    }
}
class child1 extends parent1{
	 int value = 20;

	    void displays() {
	        System.out.println("Value in Child class: " + value); // Refers to Child's value
	        System.out.println("Value in Parent class: " + super.value); // Refers to Parent's value
	    }
	    
	    child1() {
	        super(); // Calling the parent class constructor
	        System.out.println("Child class constructor");
	    }
	    void display() {
	        super.display(); // Calling the parent class method
	        System.out.println("Display from Child class");
	    }
}
public class demo6 {
	public static void main(String[] args) {
		  child1 child = new child1();
	        child.displays();
	        child.display();
	        // Output:
	        // Value in Child class: 20
	        // Value in Parent class: 10	
	}

	
}
