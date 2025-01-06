package Day22;

//thread sleep
public class demo5 extends Thread{    
	 public void run(){    
		  for(int i=1;i<5;i++){   
		  // the thread will sleep for the 500 milli seconds   
		    try{
		    	// delay an event for particular time slot
		    	Thread.sleep(2000);
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }    
		    System.out.println(i);    
		  }    
		 }    
		 public static void main(String args[]){ 
		  // creating thread t1 and t2
		  demo5 t1=new demo5();    
		  demo5 t2=new demo5();    
		  // start thread t1 and t2
		  t1.start();    
		  t2.start();    
		 }    
		}    