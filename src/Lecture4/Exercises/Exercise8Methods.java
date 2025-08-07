package Lecture4.Exercises;

import java.util.Scanner;
import java.util.Stack;

public class Exercise8Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> bookStack = new Stack<>();
        boolean isRunning = true;

        while (isRunning){
            System.out.println("Book Stack Manager Menu:");
            System.out.println("Press 1 to add new book");
            System.out.println("Press 2 to view last book");
            System.out.println("Press 3 to read/remove last book");
            System.out.println("Press 4 to exit");
            System.out.println("Select a option");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter the book title to add:");
                    String bookToAdd = scanner.nextLine();
                    bookStack.push(bookToAdd);
                    System.out.println(bookToAdd + " is added to the book stack");
                    break;
                case 2:
                    if (!isBooksStackEmpty(bookStack)){
                        System.out.println("Top book is: " + bookStack.peek());
                    }
                    break;
                case 3:
                    if (!isBooksStackEmpty(bookStack)){
                        String removedBook = bookStack.pop();
                        System.out.println(removedBook + " is removed/readed from the stack");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Book Stack Manager. Goodbye!");
                    scanner.close();
                    isRunning = false;
                    break;
                default:
                    System.out.println("The selected option is not valid, please select option from menu");
            }
        }
    }
    public static boolean isBooksStackEmpty(Stack<String> booksStack){
        boolean isEmpty = true;
        if (booksStack.isEmpty()){
            // System.out.println("The stack is empty");
            System.out.println("There no books added");
        }else{
            isEmpty = false;
        }
        return isEmpty;
    }
}
