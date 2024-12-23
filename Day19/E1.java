package Day19;
//Example 1: Basic Encapsulation

	 class Employee {
	    // Private attributes
	    private String name;
	    private int id;

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for id
	    public int getId() {
	        return id;
	    }

	    // Setter for id
	    public void setId(int id) {
	        this.id = id;
	    }
	}

	public class E1{
	    public static void main(String[] args) {
	        Employee emp = new Employee();
	        emp.setName("John Doe");
	        emp.setId(101);

	        System.out.println("Employee Name: " + emp.getName());
	        System.out.println("Employee ID: " + emp.getId());
	    }
	}