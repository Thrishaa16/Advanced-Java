/* Array List programs
 1. Write a java program for getting different colors through ArrayList interface and search whether
 the color "Red" is available or not */

package Q1;

import java.util.ArrayList;

public class ColorSearch {

    // Method to search for a specific color in the list
    public static boolean searchColor(ArrayList<String> list, String color) {
        return list.contains(color);
    }

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        // Display all colors in the list
        System.out.println("Colors in the list: " + colors);

        // Search for "Red" in the list
        if (searchColor(colors, "Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is NOT available in the list.");
        }
    }
}
