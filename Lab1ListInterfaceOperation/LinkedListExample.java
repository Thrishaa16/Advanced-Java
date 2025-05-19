/*LinkedList programs
 *  Write a Java program to display elements and their positions in a linked list ( using 
l_listobj.get(p) )
 */

package Q1;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> l_listobj = new LinkedList<>();

        l_listobj.add("Apple");
        l_listobj.add("Banana");
        l_listobj.add("Cherry");
        l_listobj.add("Date");
        l_listobj.add("Elderberry");

        // Display elements and their positions using get(p)
        System.out.println("Elements in the linked list with their positions:");
        for (int p = 0; p < l_listobj.size(); p++) {
            System.out.println("Position " + p + ": " + l_listobj.get(p));
        }
    }
}
