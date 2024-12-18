package Day18;
//Java program to convert object into primitives  
//Unboxing example of Integer to int 
public class demo6 {

	public static void main(String[] args) {
		//Converting Integer to int  /  
				Integer a=new Integer(3); 
				//converting Integer to int explicitly  
				int i=a.intValue();
				//unboxing, now compiler will write a.intValue() internally
				int j=a;    		    
				System.out.println(a+" "+i+" "+j);    
			}
		}