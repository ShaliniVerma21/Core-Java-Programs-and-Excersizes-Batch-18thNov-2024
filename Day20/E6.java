package Day20;
//7. Using Throws in Method Signature
import java.io.*;
public class E6 {

	    public static void readFile(String file) throws IOException {
	        FileReader fr = new FileReader(file);
	        fr.close();
	    }

	    public static void main(String[] args) {
	        try {
	            readFile("nonexistentfile.txt");
	        } catch (IOException e) {
	            System.out.println("Caught IOException: " + e.getMessage());
	        }
	    }
	}