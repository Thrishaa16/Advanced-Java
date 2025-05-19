/*Linkedlist programs
 *  Write a Java program to display elements and their positions in a linked list ( using 
l_listobj.get(p) )
 */

package Q1;
import java.util.LinkedList;

public class InsertAtEnd {

    public static void main(String[] args) {
        // Create a LinkedList to store color names
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors to the LinkedList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Display the list before inserting the new element
        System.out.println("LinkedList before insertion: " + colors);

        // Insert the specified element at the end of the LinkedList using offerLast()
        colors.offerLast("Pink");

        // Display the list after inserting the new element
        System.out.println("LinkedList after inserting 'Pink' at the end: " + colors);
    }
}
