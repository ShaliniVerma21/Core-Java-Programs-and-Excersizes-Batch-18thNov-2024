package Day17;

public class s1 {
	public static void main(String args[]){ 
		//creating string by Java string literal
		String s1="java";
		
		//Char array
		char ch[]={'s','t','r','i','n','g','s'}; 
		
		//converting char array to string 
		String s2=new String(ch);
		
		//creating Java string by new keyword    
		String s3=new String("example");
		
		//empty string 
		String s4 = "";
		
		//numeric string
		String s5="12345";
		
		//single space string
		String s6 = " ";
		
		//MultiLine String blocks (java 13 or later)
		String s7 = """
				This is Multiline Blocks
				This is Multiline Blocks
				This is Multiline Blocks
				This is Multiline Blocks
				""";
		
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);  
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		} 
	}