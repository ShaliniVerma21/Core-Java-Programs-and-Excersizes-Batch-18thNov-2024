package Day10;
//Art Gallery
class ArtPiece {
    private String title;
    private String artist;
    private double price;

    // Constructor
    public ArtPiece(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    // Method to display art piece details
    public void displayArtDetails() {
        System.out.println("Title: " + title + ", Artist: " + artist + ", Price: " + price);
    }
}

// Example usage
public class Main11 {
    public static void main(String[] args) {
        ArtPiece art = new ArtPiece("Mona Lisa", "Leonardo da Vinci", 1000000.0);
        art.displayArtDetails();
    }
}