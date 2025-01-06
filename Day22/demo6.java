package Day22;

//Can we start a thread twice

public class demo6 extends Thread{  
	 public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
		  demo6 t1=new demo6();  
		  t1.start();  
		  t1.start();  
		 }  
		}  