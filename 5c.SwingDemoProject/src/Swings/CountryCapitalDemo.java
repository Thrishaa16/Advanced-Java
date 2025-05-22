/*
 5c. Develop a Swing program in Java to add the countries 
 USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, 
 Africa, Greenland, Singapore into a JList and
 display the capital of the countries on console whenever the countries are selected on the list.
*/

package Q5;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitalDemo extends JFrame {

    private final JList<String> countryList;
    private final Map<String, String> capitalMap;
    private final JTextArea outputArea;

    public CountryCapitalDemo() {
        // Initialize country-capital map
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington, D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Create list model and populate it
        DefaultListModel<String> model = new DefaultListModel<>();
        capitalMap.keySet().forEach(model::addElement);

        // Create the list and set selection mode
        countryList = new JList<>(model);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Output area to display capitals
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane outputScrollPane = new JScrollPane(outputArea);

        // Add listener to display selected capitals in text area
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    StringBuilder output = new StringBuilder("Selected country capitals:\n");
                    for (String country : countryList.getSelectedValuesList()) {
                        String capital = capitalMap.get(country);
                        output.append(country).append(" -> ").append(capital).append("\n");
                    }
                    outputArea.setText(output.toString());
                }
            }
        });

        // Layout setup
        setLayout(new BorderLayout());
        add(new JScrollPane(countryList), BorderLayout.WEST);
        add(outputScrollPane, BorderLayout.CENTER);

        // Frame settings
        setTitle("Country Capitals Viewer");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CountryCapitalDemo::new);
    }
}