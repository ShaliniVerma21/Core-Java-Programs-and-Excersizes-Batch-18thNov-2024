package Day20;
//	4. Custom Exception

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class E3 {
    public static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be at least 18");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (AgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}