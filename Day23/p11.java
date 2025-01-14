package Day23;
/*
 3. Local Inner Class: Calculator
Problem: Create a Calculator class that uses a local inner class to 
perform addition. 
 */
class Calculator {
    void add(int a, int b) {
        class Adder {
            void sum() {
                System.out.println("Sum: " + (a + b));
            }
        }
        Adder adder = new Adder();
        adder.sum(); // Output: Sum: 7 (if a=3, b=4)
    }
}

public class p11{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(3, 4);
    }
}