package Day23;
//3. Local Inner Class
class Outer {
    void outerMethod() {
        final String message = "Hello from Outer class!";

        // Local inner class
        class LocalInner {
            void displayMessage() {
                System.out.println(message);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.displayMessage();
    }
}

// Usage
public class demo3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}