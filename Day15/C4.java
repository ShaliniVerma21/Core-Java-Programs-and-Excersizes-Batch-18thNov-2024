package Day15;
//Example 2:

class C4Address {
    String street;
    String city;

    public C4Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public C4Address(String street) {
        this(street, "Anytown"); // calls the other constructor
    }
}
public class C4 {
    public static void main(String[] args) {
        C4Address C4Address = new C4Address("123 Main St");
        System.out.println(C4Address.street); // prints "123 Main St"
        System.out.println(C4Address.city); // prints "Anytown"
    }
}