package Day23;
/*
10. Static Nested Class: User Profile
Problem: Create a User Profile class with a static nested class ProfileDetails to manage user information.
*/
class UserProfile {
    private static String platform = "Social Media";

    static class ProfileDetails {
        void display() {
            System.out.println("Platform: " + platform);
        }
    }
}

public class p18{
    public static void main(String[] args) {
        UserProfile.ProfileDetails details = new UserProfile.ProfileDetails();
        details.display(); // Output: Platform: Social Media
    }
}