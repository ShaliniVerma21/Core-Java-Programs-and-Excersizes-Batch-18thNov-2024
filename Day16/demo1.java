package Day16;

public class demo1 {
	    public static void main(String[] args) {
	        // Declare an array of objects
	        Person[] people;

	        // Initialize an array of objects
	        people = new Person[3];

	        // Assign values to an array of objects
	        people[0] = new Person("John", 30);
	        people[1] = new Person("Alice", 25);
	        people[2] = new Person("Bob", 40);

	        // Print all array elements
	        for (int i = 0; i < people.length; i++) {
	            System.out.println("Person at index " + i + ": " + people[i].getName() + ", " + people[i].getAge());
	        }
	    }
	}

	class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	}