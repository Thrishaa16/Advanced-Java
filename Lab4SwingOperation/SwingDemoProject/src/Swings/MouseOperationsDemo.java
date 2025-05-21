//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
//pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
//event handling mechanism with addActionListener( ).
package Swings;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseOperationsDemo extends JFrame {

    private JButton clickButton;
    private JLabel messageLabel;

    public MouseOperationsDemo() {
        setTitle("Mouse Operations Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Center panel for button
        JPanel centerPanel = new JPanel();
        clickButton = new JButton("Click Me!");
        clickButton.setFont(new Font("Arial", Font.BOLD, 16));
        centerPanel.add(clickButton);

        // Bottom message label
        messageLabel = new JLabel(" ", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 14));

        add(centerPanel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.SOUTH);

        // Mouse events using MouseAdapter
        clickButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                messageLabel.setText("Mouse Down on Button");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                messageLabel.setText("Mouse Up on Button");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    messageLabel.setText("Double Click on Button");
                } else {
                    messageLabel.setText("Single Click on Button");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseOperationsDemo());
    }
}
