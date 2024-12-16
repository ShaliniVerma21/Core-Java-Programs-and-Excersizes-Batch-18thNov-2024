package Day16;
//Object Cloning (Shallow Copy)
	class Person1 implements Cloneable {
	    private String name;
	    private Address1 Address1;

	    public Person1(String name, Address1 Address1) {
	        this.name = name;
	        this.Address1 = Address1;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Address1 getAddress1() {
	        return Address1;
	    }

	    public void setAddress1(Address1 Address1) {
	        this.Address1 = Address1;
	    }

	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	}

	class Address1 {
	    private String street;
	    private String city;

	    public Address1(String street, String city) {
	        this.street = street;
	        this.city = city;
	    }

	    public String getStreet() {
	        return street;
	    }

	    public void setStreet(String street) {
	        this.street = street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }
	}

	public class demo2 {
	    public static void main(String[] args) throws CloneNotSupportedException {
	        Address1 Address1 = new Address1("123 Main St", "Anytown");
	        Person1 Person1 = new Person1("John", Address1);

	        Person1 clonedPerson1 = (Person1) Person1.clone();

	        System.out.println("Original Person1: " + Person1.getName() + ", " + Person1.getAddress1().getStreet() + ", " + Person1.getAddress1().getCity());
	        System.out.println("Cloned Person1: " + clonedPerson1.getName() + ", " + clonedPerson1.getAddress1().getStreet() + ", " + clonedPerson1.getAddress1().getCity());

	        // Modify the cloned Person1's Address1
	        clonedPerson1.getAddress1().setStreet("456 Elm St");
	        clonedPerson1.getAddress1().setCity("Othertown");

	        System.out.println("Original Person1 after modification: " + Person1.getName() + ", " + Person1.getAddress1().getStreet() + ", " + Person1.getAddress1().getCity());
	        System.out.println("Cloned Person1 after modification: " + clonedPerson1.getName() + ", " + clonedPerson1.getAddress1().getStreet() + ", " + clonedPerson1.getAddress1().getCity());
	    }
	}