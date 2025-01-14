package Day23;
//4. Anonymous Inner Class
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anonymous Inner Class Example");
        JButton button = new JButton("Click Me");

        // Anonymous inner class implementing ActionListener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}