package Day22;

//Using the Thread Class: Thread(Runnable r, String name)
public class demo4 implements Runnable  {    
public void run()  
{    
System.out.println("Now the thread is running ...");    
}    
    
// main method  
public static void main(String argvs[])  
{   
// creating an object of the class demo4 
Runnable r1 = new demo4();   
  
// creating an object of the class Thread using Thread(Runnable r, String name)  
Thread th1 = new Thread(r1, "Rabbit");    
Thread th2 = new Thread(r1, "Turtle"); 
// the start() method moves the thread to the active state  
th1.start();   
th2.start();    
// getting the thread name by invoking the getName() method  
String str1 = th1.getName(); 
String str2 = th2.getName();  
System.out.println(str1);  
System.out.println(str2); 
}    
}    