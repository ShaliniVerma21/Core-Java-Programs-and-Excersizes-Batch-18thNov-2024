package Day15;
/*
 * A private constructor is a constructor that is declared with the private access modifier.
 *  It can only be accessed within the same class.
 *  
 *  Example 1:
 */


public class C5 {
    private static C5 instance;

    private C5() {} // private constructor

    public static C5 getInstance() {
        if (instance == null) {
            instance = new C5();
        }
        return instance;
    }

    public static void main(String[] args) {
        C5 singleton = C5.getInstance();
        System.out.println(singleton); // prints the singleton instance
    }
}