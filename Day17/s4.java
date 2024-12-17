package Day17;
public class s4 {
	 public static void main(String args[]){  
		   String s="Sachin"; 
		   //concat() method appends the string at the end  
		   s.concat(" Tendulkar");
		   //will print Sachin because strings are immutable objects  
		   System.out.println(s);
		   
		   
		   //But if we explicitly assign it to the reference variable, 
		   //it will refer to "Sachin Tendulkar" object.
		   //String s="Sachin";  
		   s=s.concat(" Tendulkar");  
		   System.out.println(s);  
		 }   
}
