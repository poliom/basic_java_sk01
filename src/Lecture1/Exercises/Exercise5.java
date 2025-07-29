package Lecture1.Exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter side A as int number, and press Enter");
        int sideA = scanner.nextInt();
        System.out.println("Please enter side B as int number, and press Enter");
        int sideB = scanner.nextInt();
        System.out.println("Please enter side C as int number, and press Enter");
        int sideC = scanner.nextInt();
        int perimeter = sideA + sideB + sideC;
        System.out.println("Triangle perimeter is: " + perimeter);
    }
}
