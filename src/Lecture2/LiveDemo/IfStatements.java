package Lecture2.LiveDemo;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numberOne");
        int numberOne = scanner.nextInt();
        System.out.println("Please enter numberTwo");
        int numberTwo = scanner.nextInt();

        if (numberOne == numberTwo){
            System.out.println("NumberOne is same as than numberTwo");
        }
        else if (numberOne < numberTwo) {
            System.out.println("NumberOne is different than numberTwo");
            System.out.println("NumberTwo is bigger than numberOne");
        }
        else{
            System.out.println("NumberOne is different than numberTwo");

            if (numberOne > numberTwo){
                System.out.println("NumberOne is bigger than numberTwo");
            }
        }

        System.out.println("Program workflow");
    }
}
