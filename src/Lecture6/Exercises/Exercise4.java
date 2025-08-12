package Lecture6.Exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> books = new Stack<>();

        while (true){
            System.out.println("Please use one of the following commands");
            System.out.println("PUSH + book title");
            System.out.println("POP");
            System.out.println("PEEK");
            System.out.println("SEARCH + keyword");
            System.out.println("EXIT");

            String input = scanner.nextLine().trim();

            if (input.toLowerCase().equals("exit")){
                break;
            }

            if (input.toLowerCase().startsWith("push ")){
                String title = input.substring(5).trim();
                books.push(title);
                System.out.println("Added book to the stack with title: " + title);
            } else if (input.toLowerCase().startsWith("pop")) {
                if (books.isEmpty()){
                    System.out.println("Book stack is Empty");
                }
                else {
                    String title = books.pop();
                    System.out.println("The book that is remove/pop from the stack is: " + title);
                }
            } else if (input.toLowerCase().startsWith("peek")) {
                if (books.isEmpty()){
                    System.out.println("Book stack is Empty");
                }
                else {
                    System.out.println("The top book title is: " + books.peek());
                }
            } else if (input.toLowerCase().startsWith("search ")) {
                String keyword = input.substring(7).trim();
                boolean isFound = false;
                ArrayList<String> foundInTitle = new ArrayList<>();

                for (String title : books){
                    if (title.toLowerCase().contains(keyword)){
                        foundInTitle.add(title);
                        isFound = true;
                    }
                }

                if (isFound){
                    System.out.println("Keyword is found in: " + foundInTitle);
                }
                else {
                    System.out.println("Keyword is not found in any title.");
                }
            } else {
                System.out.println("Not valid command, please use: ");
                System.out.println();
            }
        }
    }
}
