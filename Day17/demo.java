package Day17;

public class demo {
		 public static void main(String args[]){ 
		  //Example-1
		  String str="Sachin";  
		  str.concat(" Tendulkar");//concat() method appends the string at the end
		  System.out.println(str);//will print Sachin because strings are immutable objects  
		   
		  //Example-2
		  String str1 = "Sachin";
		  str1=str1.concat(" Tendulkar");  
		  System.out.println(str1);
		  
		  //Example-3
		  //creating string literals
		  String s1 = "Hello";
		  String s2 = "Hello";
		  
		  //both refers the same object in the string constant pool
		  System.out.println(s1==s2);
		  
		  //creating string using new keyword
		  String s3 = new String("Hello");
		  
		  //both s1 and s3 refers to the different string constant pool
		  System.out.println(s1==s3);
		  
		  //interning the s3 string
		  String s4=s3.intern();
		  
		  //now s3 refers to the same object as s1 and s2 refers to the same string constant pool
		  System.out.println(s1==s4);
		  
		  
		 }  
	}  
