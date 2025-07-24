package MyFirstPackage;

import java.util.Scanner;

public class MyFirstInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("-----------");
        System.out.println("The entered name is: " + name);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("-----------");
        System.out.println("The age of " + name + " is: " + age);
        System.out.println("Enter your height:");
        double height = scanner.nextDouble();
        System.out.println("Your height is: " + height);

        System.out.println("Please enter two numbers:");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        System.out.println("No brackets");
        System.out.println("The sum of numbers is: " + numberTwo+numberOne);
        System.out.println("With brackets");
        System.out.println("The sum of numbers is: " + (numberTwo+numberOne));
    }
}
