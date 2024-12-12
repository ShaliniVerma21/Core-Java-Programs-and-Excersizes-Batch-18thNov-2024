package Day15;
//Example 2:

class C2Address {
    String street;
    String city;

    public C2Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public C2Address(C2Address other) {
        this.street = other.street;
        this.city = other.city;
    }
}
public class C2 {
    public static void main(String[] args) {
        C2Address C2Address1 = new C2Address("123 Main St", "Anytown");
        C2Address C2Address2 = new C2Address(C2Address1);

        System.out.println(C2Address2.street); // prints "123 Main St"
        System.out.println(C2Address2.city); // prints "Anytown"
    }
}

