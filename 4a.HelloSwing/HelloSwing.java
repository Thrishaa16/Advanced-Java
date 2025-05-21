/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing 
Programming in Blue color plain font with font size of  32  using Jframe and Jlabel*/

package Q4;

import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Swing Welcome");

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font: plain style, size 32
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add label to the frame
        frame.add(label);

        // Set size and default close operation
        frame.setSize(800, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
