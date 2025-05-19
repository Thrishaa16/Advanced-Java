/*ArrayList programs
 	Write a java program for getting different colors through ArrayList interface and extract the 
elements 1st and 2nd from the ArrayList object  by  using SubList() */

package Q1;
import java.util.ArrayList;
import java.util.List;

public class ColorSublist {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display the list of colors before extracting sublist
        System.out.println("Original Colors List: " + colors);

        // Extract 1st and 2nd elements using subList()
        // subList(fromIndex, toIndex) -> The 'toIndex' is exclusive
        List<String> sublist = colors.subList(0, 2);

        // Display the sublist of 1st and 2nd elements
        System.out.println("Sublist with 1st and 2nd elements: " + sublist);
    }
}
