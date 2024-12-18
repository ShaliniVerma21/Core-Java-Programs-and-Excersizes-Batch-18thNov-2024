package Day18;
//Java program to convert primitive into objects  
//Autoboxing example of int to Integer  
public class demo5 {

	public static void main(String[] args) {
		//Converting int into Integer  

				int a=20; 
				//converting int into Integer explicitly  
				Integer i=Integer.valueOf(a);
				//autoboxing, now compiler will write Integer.valueOf(a) internally  
				Integer j=a;
				  
				System.out.println(a+" "+i+" "+j);  
			}

		}
