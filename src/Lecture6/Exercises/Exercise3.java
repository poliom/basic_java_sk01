package Lecture6.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Please enter integer numbers per line or end to continue");

        while (true){
            String input = scanner.nextLine().trim();
            if (input.equals("end")){
                break;
            }

            int number = Integer.parseInt(input);
            numbers.add(number);
        }

        if (numbers.isEmpty()){
            System.out.println("No number are added");
        }
        else {
            int minNumber = numbers.get(0);
            int maxNumber = numbers.get(0);
            int sum = 0;

            for(int number : numbers){
                if (minNumber > number){
                    minNumber = number;
                }
                if (maxNumber < number){
                    maxNumber = number;
                }
                sum += number;
            }

            double average = (double) sum/numbers.size();

            System.out.println("Min number is: " + minNumber);
            System.out.println("Max number is: " + maxNumber);
            System.out.println("Average is: " + average);

            System.out.println("Number divisible by 5 till 150");
            for (int number : numbers){
                if (number > 150){
                    break;
                }
                if (number % 5 == 0){
                    System.out.print(number + " ");
                }
            }
        }
    }
}
