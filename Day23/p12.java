package Day23;
/*
4. Anonymous Inner Class: Event Handling
Problem: Create a simple GUI button that prints a message when clicked 
using an anonymous inner class. 
*/
import javax.swing.JButton;
import javax.swing.JFrame;

public class p12{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anonymous Inner Class Example");
        JButton button = new JButton("Click Me");

        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}