/*LinkedList programs
  	Write a Java program to iterate a linked list in reverse order (using 
objlist.descendingIterator())
 */


package Q1;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedListIterator {

    public static void main(String[] args) {
        // Create a LinkedList to store color names
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors to the LinkedList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display the original LinkedList
        System.out.println("Original LinkedList: " + colors);

        // Create an Iterator to iterate in reverse order using descendingIterator()
        Iterator<String> reverseIterator = colors.descendingIterator();

        // Iterate through the list in reverse order
        System.out.println("\nIterating in reverse order:");
        while (reverseIterator.hasNext()) {
            // Print each element in reverse order
            System.out.println(reverseIterator.next());
        }
    }
}
