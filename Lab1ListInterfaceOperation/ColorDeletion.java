/*ArrayList programs
 	Write a java program for getting different colors through ArrayList interface and delete nth  
element from the ArrayList object  by  using remove by index
 */
package Q1;
import java.util.ArrayList;
import java.util.Scanner;

public class ColorDeletion {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display the list of colors before deletion
        System.out.println("Colors in the list before deletion: " + colors);

        // Take input for nth element to be deleted
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element to delete (0-based index): ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < colors.size()) {
            colors.remove(index);
            System.out.println("Colors in the list after deletion: " + colors);
        } else {
            System.out.println("Invalid index! Please enter a valid index.");
        }

        scanner.close();
    }
}
