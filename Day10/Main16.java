package Day10;
//Music Album
class MusicAlbum {
    private String albumName;
    private String artist;
    private int releaseYear;

    // Constructor
    public MusicAlbum(String albumName, String artist, int releaseYear) {
        this.albumName = albumName;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    // Method to display album details
    public void displayAlbumDetails() {
        System.out.println("Album: " + albumName + ", Artist: " + artist + ", Year: " + releaseYear);
    }
}

// Example usage
public class Main16 {
    public static void main(String[] args) {
        MusicAlbum album = new MusicAlbum("Dil Se", "A.R. Rahman", 1998);
        album.displayAlbumDetails();
    }
}