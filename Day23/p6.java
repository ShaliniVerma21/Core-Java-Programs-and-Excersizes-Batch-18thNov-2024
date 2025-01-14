package Day23;
/*
 17. Local Inner Class: Email Validator
Problem: Create an EmailValidator class that uses a local inner class to validate email addresses. 
 */
class EmailValidator {
    void validate(String email) {
        class Validator {
            boolean isValid() {
                return email.contains("@") && email.contains(".");
            }
        }
        Validator validator = new Validator();
        System.out.println("Is valid email: " + validator.isValid()); // Output: Is valid email: <true/false>
    }
}

public class p6{
    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();
        validator.validate("test@example.com");
    }
}