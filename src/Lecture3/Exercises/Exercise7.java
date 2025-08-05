package Lecture3.Exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int number = 11;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Guess my number");
        do {
            if(attempts!=0){
                System.out.println("Please try again");
            }

            System.out.println("Enter the guess");

            guess = scanner.nextInt();
            if (number == guess){
                System.out.println("Yes this is the number");
                break;
            } else if (number> guess) {
                System.out.println("Number is higher");
            }
            else {
                System.out.println("Number is lower");
            }

            attempts++;
        }while (attempts < 10);

        if (attempts == 10){
            System.out.println("hahahahah, better luck next time");
        }
    }
}
