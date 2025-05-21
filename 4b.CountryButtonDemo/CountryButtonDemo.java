/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
 pressed” depending upon the Jbutton either  Srilanka or India is pressed by implementing the
 event handling mechanism with addActionListener( ).*/


package Q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Country Button Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton btnSrilanka = new JButton("Srilanka");
        JButton btnIndia = new JButton("India");

        // Create label to show output
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        // Add action listeners
        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        // Add components to frame
        frame.add(btnSrilanka);
        frame.add(btnIndia);
        frame.add(messageLabel);

        // Center and show the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
