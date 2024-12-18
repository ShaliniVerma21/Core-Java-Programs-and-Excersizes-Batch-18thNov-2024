package Day18;
//4. Splitting a String Using Regular Expressions
public class demo12 {

	public static void main(String[] args) {
        String text = "Hello, world! Welcome to Java programming.";
        String regex = "[\\s,!.]+";

        String[] words = text.split(regex);
        for (String word : words) {
            System.out.println(word);
        }
    }
}