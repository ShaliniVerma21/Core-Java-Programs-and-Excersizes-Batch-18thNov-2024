package Day15;
//Example 2:

public class C6{
    private C6() {} // private constructor

    public static void doSomething() {
        System.out.println("Doing something...");
    }

    public static void main(String[] args) {
        C6.doSomething(); // prints "Doing something..."
    }
}