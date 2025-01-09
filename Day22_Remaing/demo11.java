package Day22_Remaing;
/*
 In Java, serialization is the process of converting an object into a byte stream, 
 which can then be saved to a file or transmitted over a network. The opposite process, 
 deserialization, converts the byte stream back into a copy of the original object.
 
 
 Serializable vs. Not Serializable
 
1. Serializable
Definition: 
A class is considered serializable if it implements the java.io.Serializable interface. 
This interface does not contain any methods; 
it serves as a marker to indicate that the class can be serialized.
 */
import java.io.*;

//Class implementing Serializable
class User1 implements Serializable {
 private String name;
 private int age;

 public User1(String name, int age) {
     this.name = name;
     this.age = age;
 }

 @Override
 public String toString() {
     return "User1 {name='" + name + "', age=" + age + "}";
 }
}

public class demo11{
 public static void main(String[] args) {
     User1 User1 = new User1("Alice", 30);

     // Serialize the User1 object
     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("User1.doc"))) {
         oos.writeObject(User1);
         System.out.println("User1  serialized: " + User1);
     } catch (IOException e) {
         e.printStackTrace();
     }

     // Deserialize the User1 object
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("User1.doc"))) {
         User1 deserializedUser1  = (User1 ) ois.readObject();
         System.out.println("User1  deserialized: " + deserializedUser1 );
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}