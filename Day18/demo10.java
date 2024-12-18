package Day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//2. Finding All Occurrences of a Word
public class demo10 {

	public static void main(String[] args) {
		  String text = "Java is a programming language. Java is also an island.";
	        String regex = "Java";

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(text);

	        while (matcher.find()) {
	            System.out.println("Found at index: " + matcher.start());
	        }
	    }
	}