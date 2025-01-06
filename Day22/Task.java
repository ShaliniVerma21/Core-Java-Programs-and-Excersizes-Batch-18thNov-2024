package Day22;

//Import necessary classes
import java.io.*;
import java.net.*;

//Define a class to represent a file downloader thread
class FileDownloader extends Thread {
private String url;
private String filename;

public FileDownloader(String url, String filename) {
this.url = url;
this.filename = filename;
}

public void run() {
try {
 // Download the file
 URL url = new URL(this.url);
 HttpURLConnection connection = (HttpURLConnection) url.openConnection();
 connection.setRequestMethod("GET");
 connection.connect();

 // Read the file contents
 InputStream inputStream = connection.getInputStream();
 FileOutputStream fileOutputStream = new FileOutputStream(filename);
 byte[] buffer = new byte[1024];
 int bytesRead;
 while ((bytesRead = inputStream.read(buffer)) != -1) {
   fileOutputStream.write(buffer, 0, bytesRead);
 }
 fileOutputStream.close();
 inputStream.close();

 System.out.println("Downloaded " + filename);
} catch (IOException e) {
 System.out.println("Error downloading " + filename + ": " + e.getMessage());
}
}
}

//Main class to demonstrate multithreading
public class Task{
public static void main(String[] args) {
// Create multiple file downloader threads
FileDownloader thread1 = new FileDownloader("https://repo1.maven.org/maven2/commons-io/commons-io/1.3.2/commons-io-1.3.2-bin.zip", "commons-io-1.3.2-bin.zip");
FileDownloader thread2 = new FileDownloader("https://repo1.maven.org/maven2/commons-io/commons-io/1.3.2/commons-io-1.3.2-bin.zip", "commons-io-1.3.2-bin.zip");
FileDownloader thread3 = new FileDownloader("https://repo1.maven.org/maven2/commons-io/commons-io/1.3.2/commons-io-1.3.2-bin.zip", "commons-io-1.3.2-bin.zip");

// Start the threads
thread1.start();
thread2.start();
thread3.start();
}
}