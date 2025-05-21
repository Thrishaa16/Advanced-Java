/*LinkedList programs
 * Write a Java program that swaps two elements ( first and third elements ) in a linked list  ( using
 Collections.swap(l_list, 0, 2)) 

 */

package Q1;

import java.util.Collections;
import java.util.LinkedList;

public class SwapElements {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> l_list = new LinkedList<>();

        // Add elements to the LinkedList
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Blue");
        l_list.add("Yellow");

        // Display original list
        System.out.println("Original LinkedList: " + l_list);

        // Swap the first (index 0) and third (index 2) elements
        Collections.swap(l_list, 0, 2);

        // Display the modified list
        System.out.println("LinkedList after swapping first and third elements: " + l_list);
    }
}
