package Day22_Remaing;

/*
 2. Not Serializable
Definition: 
A class is considered not serializable if it does not implement the Serializable 
interface.Attempting to serialize an instance of a non-serializable class will 
result in a java.io.NotSerializableException. 
 */
import java.io.*;

//Class not implementing Serializable
class NonSerializableUser  {
 private String name;
 private int age;

 public NonSerializableUser (String name, int age) {
     this.name = name;
     this.age = age;
 }

 @Override
 public String toString() {
     return "NonSerializableUser {name='" + name + "', age=" + age + "}";
 }
}

public class demo12{
 public static void main(String[] args) {
     NonSerializableUser  user = new NonSerializableUser ("Bob", 25);

     // Attempt to serialize the non-serializable user object
     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream
    		 ("user.doc"))) {
         oos.writeObject(user); // This will throw NotSerializableException
     } catch (IOException e) {
         System.out.println("Serialization failed: " + e.getMessage());
     }
 }
}