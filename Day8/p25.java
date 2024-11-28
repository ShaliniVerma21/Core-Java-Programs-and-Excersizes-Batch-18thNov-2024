package Day8;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
// SimpleDateFormat class to format the date string
public class p25 {
	    public static void main(String[] args) {
	        // Create a scanner to read user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user for a date input
	        System.out.print("Enter a date (yyyy-MM-dd): ");
	        String inputDate = scanner.nextLine();
	        
	        // Define the input and output date formats
	        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
	        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
	        
	        try {
	            // Parse the input date string to a Date object
	            Date date = inputFormat.parse(inputDate);
	            
	            // Format the Date object to the desired output format
	            String formattedDate = outputFormat.format(date);
	            
	            // Display the formatted date
	            System.out.println("Formatted Date: " + formattedDate);
	        } catch (Exception e) {
	            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
	        } finally {
	            // Close the scanner
	            scanner.close();
	        }
	    }
	}