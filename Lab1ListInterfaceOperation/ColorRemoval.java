/* ArrayList programs
Write a java program for getting different colors through ArrayList interface and remove the 
2nd element and color "Blue" from the ArrayList*/


package Q1;

import java.util.ArrayList;
import java.util.Iterator;

public class ColorRemoval {

    // Method to remove 2nd element (index 1)
    public static void removeSecondElement(ArrayList<String> list) {
        if (list.size() > 1) {
            list.remove(1);  
            System.out.println("Removed 2nd element: " + list);
        } else {
            System.out.println("List is too small to remove the 2nd element.");
        }
    }

    // Method to remove color "Blue" using Iterator
    public static void removeColorBlue(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.equals("Blue")) {
                iterator.remove();  // Remove "Blue" from the list
                System.out.println("Removed color 'Blue': " + list);
                return;
            }
        }
        System.out.println("Color 'Blue' not found in the list.");
    }

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display the list of colors before removal
        System.out.println("Colors in the list before removal: " + colors);
        System.out.println();

        removeSecondElement(colors);

        removeColorBlue(colors);

        // Final list after removals
        System.out.println("Final colors in the list: " + colors);
    }
}
