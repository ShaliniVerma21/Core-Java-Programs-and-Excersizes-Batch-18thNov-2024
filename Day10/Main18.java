package Day10;
//Festival Celebration
class Festival {
    private String festivalName;
    private String date;
    private String significance;

    // Constructor
    public Festival(String festivalName, String date, String significance) {
        this.festivalName = festivalName;
        this.date = date;
        this.significance = significance;
    }

    // Method to display festival details
    public void displayFestivalDetails() {
        System.out.println("Festival: " + festivalName + ", Date: " + date + ", Significance: " + significance);
    }
}

// Example usage
public class Main18 {
    public static void main(String[] args) {
        Festival diwali = new Festival("Diwali", "24-10-2022", "Festival of Lights");
        diwali.displayFestivalDetails();
    }
}