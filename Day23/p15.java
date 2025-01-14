package Day23;
/*
 7. Local Inner Class: String Manipulation
Problem: Create a StringManipulator class that uses a local inner class to reverse a string. 
 */
class StringManipulator {
    void reverse(String str) {
        class Reverser {
            String reverseString() {
                return new StringBuilder(str).reverse().toString();
            }
        }
        Reverser reverser = new Reverser();
        System.out.println("Reversed String: " + reverser.reverseString()); // Output: Reversed String: <reversed string>
    }
}

public class p15{
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        manipulator.reverse("Hello");
    }
}