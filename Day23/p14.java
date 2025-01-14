package Day23;
/*
 6. Static Nested Class: Math Operations
Problem: Create a MathOperations class with a static nested class Calculator for basic math operations.
 */
class MathOperations {
    static class Calculator {
        static int add(int a, int b) {
            return a + b;
        }
    }
}

public class p14{
    public static void main(String[] args) {
        int result = MathOperations.Calculator.add(5, 10);
        System.out.println("Result: " + result); // Output: Result: 15
    }
}