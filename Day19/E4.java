package Day19;
//Example 4: Write-Only Class

class WriteOnlyPerson {
    private String name;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // No getter method provided
}

public class E4{
    public static void main(String[] args) {
        WriteOnlyPerson person = new WriteOnlyPerson();
        person.setName("Bob");
        // System.out.println(person.getName()); // This line would cause a compilation error
    }
}