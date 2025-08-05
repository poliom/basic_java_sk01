package Lecture4.LiveDemo;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> stringStack= new Stack<>();
        stringStack.push("Book 1");
        stringStack.push("Book 2");
        stringStack.push("Book 3");
        stringStack.push("Book 4");
        System.out.println("All elements in Stack: " + stringStack);
        System.out.println("Get first element: " + stringStack.getFirst());
        System.out.println("All elements in Stack: " + stringStack);
        System.out.println("Get Last element: " + stringStack.getLast());
        System.out.println("All elements in Stack: " + stringStack);
        System.out.println("Remove element: " + stringStack.pop());
        System.out.println("All elements in Stack: " + stringStack);
        System.out.println("Remove element: " + stringStack.remove(1));
        System.out.println("All elements in Stack: " + stringStack);
    }
}
