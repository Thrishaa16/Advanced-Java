package Q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Image Button Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Label to display result
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));

        // Load images (Make sure these files exist in your project folder)
        ImageIcon digitalClockIcon = new ImageIcon(digital_clock.jpg);
        ImageIcon hourglassIcon = new ImageIcon(hourglass.jpg);

        // Create buttons with images
        JButton btnDigitalClock = new JButton(digitalClockIcon);
        JButton btnHourGlass = new JButton(hourglassIcon);

        // Add action listeners
        btnDigitalClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        frame.add(btnDigitalClock);
        frame.add(btnHourGlass);
        frame.add(messageLabel);

        // Center and show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
