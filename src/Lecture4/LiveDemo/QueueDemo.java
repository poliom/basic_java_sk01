package Lecture4.LiveDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(24);
        queue.add(53);
        queue.add(452);
        System.out.println(queue);
        System.out.println("Next element for iteration: " + queue.peek());

        System.out.println("Number of elements in queue: " + queue.size());

        queue.remove();
        System.out.println(queue);

        int numberOfElements = queue.size();
        for (int i=0; i<numberOfElements; i++){
            System.out.println("Next element for iteration: " + queue.peek());
            System.out.println("Remove element: " + queue.poll());
            System.out.println(queue);
        }
        System.out.println("After all operations: " + queue);
    }
}
