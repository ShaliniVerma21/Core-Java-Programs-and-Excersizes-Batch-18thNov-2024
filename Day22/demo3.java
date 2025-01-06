package Day22;

public class demo3  
{  
// Main method  
public static void main(String argvs[])  
{  
// creating an object of the Thread class using the constructor Thread(String name)   
Thread t1= new Thread("Rabbit");  
Thread t2= new Thread("Turtle");
// the start() method moves the thread to the active state  
t1.start(); 
t2.start();
// getting the thread name by invoking the getName() method  
String str1 = t1.getName();
String str2 = t2.getName(); 
System.out.println(str1);  
System.out.println(str2); 
}  
} 