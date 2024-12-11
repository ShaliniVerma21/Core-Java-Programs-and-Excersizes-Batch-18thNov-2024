package Day14;
//example of method overloading in Java

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class demo1 {

	public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20)); // Output: 30
        System.out.println(calculator.add(10.5, 20.7)); // Output: 31.2
        System.out.println(calculator.add(10, 20, 30)); // Output: 60
    }
}