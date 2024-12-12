package Day15;
//Example 2:
//constructor overloading can be performed in 2 ways
//1- by changing types of constructor parameters
//2. by changing number of constructor parameters
public class C8 {
    private String street;
    private String city;

    public C8(String street) {
        this.street = street;
        this.city = "Anytown";
    }

    public C8(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public static void main(String[] args) {
        C8 address1 = new C8("123 Main St");
        C8 address2 = new C8("123 Main St", "Othertown");

        System.out.println(address1.street); // prints "123 Main St"
        System.out.println(address1.city); // prints "Anytown"
        System.out.println(address2.street); // prints "123 Main St"
        System.out.println(address2.city); // prints "Othertown"
    }
}