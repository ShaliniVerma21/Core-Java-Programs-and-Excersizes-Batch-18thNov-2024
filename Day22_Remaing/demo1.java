package Day22_Remaing;

/*
Marker Interface: 
An interface with no methods used to indicate a property.

Static vs Dynamic Binding: 
Static binding occurs at compile time, while dynamic binding occurs at runtime.

Instance of Operator: 
Used to check if an object is an instance of a specific class or interface.

Covariant Return Type: 
Allows a method to return a subtype in an overridden method
 
 1. Marker Interface
Definition: 
A marker interface is an interface with no methods or fields. 
It is used to indicate that a class possesses a certain property or behavior. 
For example, the Serializable interface in Java is a marker interface that indicates 
that a class can be serialized.
 */

//Marker interface
interface Serializable {}

//Class implementing the marker interface
class User implements Serializable {
 private String name;

 public User(String name) {
     this.name = name;
 }

 public String getName() {
     return name;
 }
}

//Usage
public class demo1 {
 public static void main(String[] args) {
     User user = new User("Alice");
     // The user object can be serialized because it implements Serializable
     System.out.println("User  created: " + user.getName());
 }
}