package Assignement_3;
//Digital Portfolio Builder 🌐: Create and showcase portfolios online.

//Abstract class representing a Portfolio Item
abstract class PortfolioItem {
 protected String title;
 protected String description;

 // Constructor
 public PortfolioItem(String title, String description) {
     this.title = title;
     this.description = description;
 }

 // Abstract method to display item details
 public abstract void displayItemDetails();
}

//Concrete class representing a Project
class Project extends PortfolioItem {
 private String projectLink;

 // Constructor
 public Project(String title, String description, String projectLink) {
     super(title, description);
     this.projectLink = projectLink;
 }

 // Method to display project details
 @Override
 public void displayItemDetails() {
     System.out.println("Project Title: " + title);
     System.out.println("Description: " + description);
     System.out.println("Project Link: " + projectLink);
 }
}

//Concrete class representing a Blog Post
class BlogPost extends PortfolioItem {
 private String blogLink;

 // Constructor
 public BlogPost(String title, String description, String blogLink) {
     super(title, description);
     this.blogLink = blogLink;
 }

 // Method to display blog post details
 @Override
 public void displayItemDetails() {
     System.out.println("Blog Post Title: " + title);
     System.out.println("Description: " + description);
     System.out.println("Blog Link: " + blogLink);
 }
}

//Class representing the Digital Portfolio
class DigitalPortfolio {
 private PortfolioItem[] items;
 private int itemCount;

 // Constructor
 public DigitalPortfolio(int capacity) {
     items = new PortfolioItem[capacity];
     itemCount = 0;
 }

 // Method to add a portfolio item
 public void addItem(PortfolioItem item) {
     if (itemCount < items.length) {
         items[itemCount] = item;
         itemCount++;
         System.out.println("Item added: " + item.title);
     } else {
         System.out.println("Portfolio is full. Cannot add more items.");
     }
 }

 // Method to display all portfolio items
 public void displayAllItems() {
     System.out.println("Digital Portfolio:");
     for (int i = 0; i < itemCount; i++) {
         items[i].displayItemDetails();
         System.out.println();
     }
 }
}

//Main class to manage the Digital Portfolio Builder
public class demo33 {
 public static void main(String[] args) {
     // Create a Digital Portfolio with a capacity of 5 items
     DigitalPortfolio portfolio = new DigitalPortfolio(5);

     // Create portfolio items
     PortfolioItem project1 = new Project("Website Redesign", "Redesigned the company website.", "http://example.com/project1");
     PortfolioItem blogPost1 = new BlogPost("Understanding OOP", "A blog post about Object-Oriented Programming.", "http://example.com/blog1");

     // Add items to the Digital Portfolio
     portfolio.addItem(project1);
     portfolio.addItem(blogPost1);

     // Display all portfolio items
     portfolio.displayAllItems();
 }
}