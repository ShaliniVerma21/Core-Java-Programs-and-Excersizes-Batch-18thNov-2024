package Day17;
/*
Strings Comparision : 
By Using equals() Method
By Using == Operator
By compareTo() Method
 */
public class s5 {
	 public static void main(String args[]){  
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";
		   String s5="SACHIN"; 
		   String s6="Ratna";
		   
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   
		   System.out.println(s1.equals(s5));//false  
		   System.out.println(s1.equalsIgnoreCase(s5));//true 
		   
		   //true (because both refer to same instance)  
		   System.out.println(s1==s2);
		   //false(because s3 refers to instance created in nonpool) 
		   System.out.println(s1==s3); 
		   
		   System.out.println(s1.compareTo(s2));//0    6-6=0    
		   System.out.println(s1.compareTo(s6));//1(because s1>s6)  
		   System.out.println(s6.compareTo(s1));//-1(because s6 < s1 )  
		 }  
}
