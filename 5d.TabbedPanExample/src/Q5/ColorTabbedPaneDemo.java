package Q5;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorTabbedPaneDemo extends JFrame {

    private final JTabbedPane tabbedPane;
    private final JPanel colorPanel;

    public ColorTabbedPaneDemo() {
        setTitle("Color Tabbed Pane Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the tabbed pane
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Cyan", null);
        tabbedPane.addTab("Magenta", null);
        tabbedPane.addTab("Yellow", null);

        // Panel whose background will change
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.CYAN);  // default

        // Listen for tab changes
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                switch (tabbedPane.getSelectedIndex()) {
                    case 0 -> colorPanel.setBackground(Color.CYAN);
                    case 1 -> colorPanel.setBackground(Color.MAGENTA);
                    case 2 -> colorPanel.setBackground(Color.YELLOW);
                }
            }
        });

        // Layout
        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColorTabbedPaneDemo::new);
    }
}
