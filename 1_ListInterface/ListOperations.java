/*1.a  Develop a Java program for adding elements   [Apple, Banana, Orange] into an ArrayList
 and a LinkedList to perform the  following operations with different functions directed  as
 follows
 1. Adding elements,   2. Adding element at specific index, 3. Adding multiple elements, 4. 
Accessing elements,5. Updating elements, 6. Removing elements,  7. Searching elements,  8. List 
size, 9. Iterating over list, 10. Using Iterator,  11. Sorting, 12. Sublist, 13. Clearing the list*/
package Q1;
import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("1. Adding Elements");
        addElements(arrayList);
        addElements(linkedList);
        printLists(arrayList, linkedList);

        System.out.println("\n2. Adding Element at Specific Index (index 1: Mango)");
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");
        printLists(arrayList, linkedList);

        System.out.println("\n3. Adding Multiple Elements (Pineapple, Grapes)");
        List<String> moreFruits = Arrays.asList("Pineapple", "Grapes");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);
        printLists(arrayList, linkedList);

        System.out.println("\n4. Accessing Element at Index 2");
        System.out.println("ArrayList Element: " + arrayList.get(2));
        System.out.println("LinkedList Element: " + linkedList.get(2));

        System.out.println("\n5. Updating Element at Index 0 to 'Strawberry'");
        arrayList.set(0, "Strawberry");
        linkedList.set(0, "Strawberry");
        printLists(arrayList, linkedList);

        System.out.println("\n6. Removing 'Banana'");
        arrayList.remove("Banana");
        linkedList.remove("Banana");
        printLists(arrayList, linkedList);

        System.out.println("\n7. Searching for 'Orange'");
        System.out.println("ArrayList contains 'Orange': " + arrayList.contains("Orange"));
        System.out.println("LinkedList contains 'Orange': " + linkedList.contains("Orange"));

        System.out.println("\n8. List Size");
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        System.out.println("\n9. Iterating Over List with for-each Loop");
        System.out.println("ArrayList:");
        for (String item : arrayList) {
            System.out.println(" - " + item);
        }
        System.out.println("LinkedList:");
        for (String item : linkedList) {
            System.out.println(" - " + item);
        }

        System.out.println("\n10. Iterating Over List with Iterator");
        System.out.println("ArrayList:");
        Iterator<String> itArray = arrayList.iterator();
        while (itArray.hasNext()) {
            System.out.println(" > " + itArray.next());
        }
        System.out.println("LinkedList:");
        Iterator<String> itLinked = linkedList.iterator();
        while (itLinked.hasNext()) {
            System.out.println(" > " + itLinked.next());
        }

        System.out.println("\n11. Sorting");
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        printLists(arrayList, linkedList);

        System.out.println("\n12. Sublist (index 1 to 3)");
        System.out.println("ArrayList Sublist: " + arrayList.subList(1, 3));
        System.out.println("LinkedList Sublist: " + linkedList.subList(1, 3));

        System.out.println("\n13. Clearing the List");
        arrayList.clear();
        linkedList.clear();
        System.out.println("ArrayList after clear: " + arrayList);
        System.out.println("LinkedList after clear: " + linkedList);
    }

    private static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
    }

    private static void printLists(List<String> arrayList, List<String> linkedList) {
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
