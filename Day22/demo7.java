package Day22;

//How to perform single task by multiple threads in Java?
public class demo7  extends Thread{  
	 public void run(){  
		   System.out.println("task one");  
		 }  
		 public static void main(String args[]){  
		  demo7 t1=new demo7();  
		  demo7 t2=new demo7();  
		  demo7 t3=new demo7();  
		  
		  t1.start();  
		  t2.start();  
		  t3.start();  
		 }  
		}  