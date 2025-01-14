package Day23;
/*
 16. Static Nested Class: User Authentication
Problem: Create a User  class with a static nested class Authenticator to manage user authentication. 
 */
class User {
    private static String systemName = "User  Management System";

    static class Authenticator {
        void authenticate(String username) {
            System.out.println("Authenticating " + username + " in " + systemName);
        }
    }
}

public class p5 {
    public static void main(String[] args) {
        User.Authenticator auth = new User.Authenticator();
        auth.authenticate("admin"); // Output: Authenticating admin in User Management System
    }
}