package Day15;
/*
A copy constructor is a constructor that creates a copy of an existing object.
Example 1:
 */
public class C1 {

	    private String name;
	    private int age;

	    public C1(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public C1(C1 other) {
	        this.name = other.name;
	        this.age = other.age;
	    }

	    public static void main(String[] args) {
	        C1 C11 = new C1("John", 30);
	        C1 C12 = new C1(C11);

	        System.out.println(C12.name); // prints "John"
	        System.out.println(C12.age); // prints 30
	    }
	}