package Lecture5.Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int[] numbers = {45,45,68,25,45,98,15,24,685,84,15};
        System.out.println("List of numbers for removing duplicates: " + Arrays.toString(numbers));
        // System.out.println("Here is the list of all numbers without duplicates: " + removeDuplicatesNumbers(numbers));
        System.out.println("Here is the list of all numbers without duplicates: " + Arrays.toString(removeDuplicatesNumbers(numbers)));
    }

//    public static ArrayList<Integer> removeDuplicatesNumbers(int[] numbers){
//        ArrayList<Integer> nonDuplicateNumbers = new ArrayList<>();
//        for (int number : numbers){
//            if (nonDuplicateNumbers.contains(number)){
//                continue;
//            }
//            nonDuplicateNumbers.add(number);
//        }
//        return nonDuplicateNumbers;
//    }

    public static int[] removeDuplicatesNumbers(int[] numbers){
        ArrayList<Integer> nonDuplicateNumbers = new ArrayList<>();

        for (int number : numbers){
            if (nonDuplicateNumbers.contains(number)){
                continue;
            }
            nonDuplicateNumbers.add(number);
        }

        int[] uniqueArray = new int[nonDuplicateNumbers.size()];

        for (int i = 0; i < nonDuplicateNumbers.size(); i++){
            uniqueArray[i] = nonDuplicateNumbers.get(i);
        }

        return uniqueArray;
    }
}
