package Day10;
//Festival Food
class FestivalFood {
    private String foodName;
    private String festivalName;

    // Constructor
    public FestivalFood(String foodName, String festivalName) {
        this.foodName = foodName;
        this.festivalName = festivalName;
    }

    // Method to display food details
    public void displayFoodDetails() {
        System.out.println("Food: " + foodName + ", Festival: " + festivalName);
    }
}

// Example usage
public class Main12 {
    public static void main(String[] args) {
        FestivalFood food = new FestivalFood("Sweets", "Diwali");
        food.displayFoodDetails();
    }
}