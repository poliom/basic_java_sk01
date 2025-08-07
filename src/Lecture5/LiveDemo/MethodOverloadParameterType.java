package Lecture5.LiveDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodOverloadParameterType {
    public static void main(String[] args) {
        System.out.println("This is Array list part");
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("word");
        wordsList.add("keyboard");
        wordsList.add("laptop");
        wordsList.add("camera");
        wordsList.add("wood");
        wordsList.add("lego");
        wordsList.add("paper");
        wordsList.add("phone");
        printWord(wordsList);
        System.out.println("End Array list part");

        System.out.println();

        System.out.println("This is Array part");
        String[] wordsArray = {"box", "glass", "monitor", "mouse", "pad"};
        printWord(wordsArray);
        System.out.println("End Array part");

        System.out.println();

        System.out.println("This is user input part");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        do {
            System.out.println("Type word and press enter");
            String word = scanner.nextLine();
            printWord(word);
            count++;
        }while (count < 10);
        System.out.println("End user input part");
    }

    public static void printWord(String word){
        System.out.println("Your word from User Input is: " + word);
    }

    public static void printWord(ArrayList<String> words){
        for (String word : words) {
            System.out.println("Your word from Array list is: " + word);
            // printWord(word);
        }
    }

    public static void printWord(String[] words){
        for (String word : words) {
            System.out.println("Your word from Array is: " + word);
        }
    }
}
