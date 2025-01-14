package Day23;
/*
 18. Anonymous Inner Class: Action Listener
Problem: Create a button with an action listener using an anonymous inner class. 
 */
import javax.swing.JButton;
import javax.swing.JFrame;

public class p7{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Action Listener Example");
        JButton button = new JButton("Press Me");

        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Button Pressed!");
            }
        });

        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}