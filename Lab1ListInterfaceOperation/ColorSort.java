/*ArrayList programs
 Write a java program for getting different colors through ArrayList interface and  sort them 
using Collections.sort( ArrayListObj)*/

package Q1;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSort {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");

        // Display the list of colors before sorting
        System.out.println("Colors in the list before sorting: " + colors);

        // Sort the ArrayList using Collections.sort()
        Collections.sort(colors);

        // Display the list of colors after sorting
        System.out.println("Colors in the list after sorting: " + colors);
    }
}
