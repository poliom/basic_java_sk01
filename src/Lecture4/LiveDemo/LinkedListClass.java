package Lecture4.LiveDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(253);
        linkedList.add(532);
        System.out.println("Linked List values: " + linkedList);

        linkedList.add(0,555);
        linkedList.add(2,333);
        System.out.println("Linked List values: " + linkedList);

        linkedList.remove(2);
        System.out.println("Linked List values: " + linkedList);

        Iterator<Integer> descending = linkedList.descendingIterator();
        while (descending.hasNext()) {
            System.out.println(descending.next());
        }
    }
}
