package Day18;
//3. Replacing All Digits in a String
public class demo11 {

	public static void main(String[] args) {
		 String input = "My phone number is 123-456-7890.";
	        String regex = "\\d"; // Matches any digit

	        String result = input.replaceAll(regex, "*");
	        System.out.println(result); // Output: My phone number is ***-***-****.
	    }
	}