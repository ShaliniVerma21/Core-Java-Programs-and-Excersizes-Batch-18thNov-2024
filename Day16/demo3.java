package Day16;
//Object Cloning Deep Copy

class Person2 implements Cloneable {
    private String name;
    private Address address;

    public Person2(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person2 clonedPerson2 = (Person2) super.clone();
        clonedPerson2.address = (Address) address.clone();
        return clonedPerson2;
    }
}

class Address implements Cloneable {
    private String street;
    private String city;

    public Address(String street, String city) {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class demo3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("123 Main St", "Anytown");
        Person2 Person2 = new Person2("John", address);

        Person2 clonedPerson2 = (Person2) Person2.clone();

        System.out.println("Original Person2: " + Person2.getName() + ", " + Person2.getAddress().getStreet() + ", " + Person2.getAddress().getCity());
        System.out.println("Cloned Person2: " + clonedPerson2.getName() + ", " + clonedPerson2.getAddress().getStreet() + ", " + clonedPerson2.getAddress().getCity());

        // Modify the cloned Person2's address
        clonedPerson2.getAddress().setStreet("456 Elm St");
        clonedPerson2.getAddress().setCity("Othertown");

        System.out.println("Original Person2 after modification: " + Person2.getName() + ", " + Person2.getAddress().getStreet() + ", " + Person2.getAddress().getCity());
        System.out.println("Cloned Person2 after modification: " + clonedPerson2.getName() + ", " + clonedPerson2.getAddress().getStreet() + ", " + clonedPerson2.getAddress().getCity());
    }
}