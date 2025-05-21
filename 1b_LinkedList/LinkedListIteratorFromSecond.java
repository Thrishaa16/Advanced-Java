/*LinkedList programs
 * Write a Java program to iterate through all elements in a linked list starting at the 
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
 */


package Q1;

import java.util.*;

public class LinkedListIteratorFromSecond {
    public static void main(String[] args) {
        // Creating a LinkedList with elements
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println("Iterating from the 2nd position (index 1):");

        // Using listIterator starting from index 1
        Iterator<String> iterator = fruits.listIterator(1);

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
