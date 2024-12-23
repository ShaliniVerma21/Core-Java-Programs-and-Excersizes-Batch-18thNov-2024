package Day19;
//Example 3: Read-Only Class

class ReadOnlyPerson {
    private String name;

    public ReadOnlyPerson(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

public class E3{
    public static void main(String[] args) {
        ReadOnlyPerson person = new ReadOnlyPerson("Alice");
        System.out.println("Person Name: " + person.getName());
        //person.name = "Bob"; // This line would cause a compilation error
    }
}