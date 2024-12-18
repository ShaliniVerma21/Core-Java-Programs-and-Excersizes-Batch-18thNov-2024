package Day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//6. Extracting Digits from a String
public class demo13 {

	public static void main(String[] args) {
		  String input = "Order number: 12345, Quantity: 10.";
	        String regex = "\\d+";

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);

	        while (matcher.find()) {
	            System.out.println("Found digit: " + matcher.group());
	        }
	    }
	}