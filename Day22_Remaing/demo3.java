package Day22_Remaing;
/*
 3. Instance of Operator
Definition: 
The instanceof operator is used to test whether an object is an instance of a specific class 
or interface. It returns true if the object is an instance of the specified type, 
otherwise it returns false.
 */
class Animal1 {}
class Dog1 extends Animal1 {}

public class demo3 {
    public static void main(String[] args) {
        Dog1 Dog1 = new Dog1();

        // Using instanceof operator
        if (Dog1 instanceof Animal1) {
            System.out.println("Dog1 is an instance of Animal1");
        } else {
            System.out.println("Dog1 is not an instance of Animal1");
        }
    }
}