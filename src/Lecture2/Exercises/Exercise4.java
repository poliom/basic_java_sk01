package Lecture2.Exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter single unit price:");
        int pricePerSingleUnit = scanner.nextInt();
        System.out.println("Enter unit quantity:");
        int quantity = scanner.nextInt();

        int discountRate = 0;
        if (quantity >= 100 && quantity <= 120){
            discountRate = 15;
        }
        else if (quantity > 120){
            discountRate = 20;
        }

        int revenueBeforeDiscount = quantity * pricePerSingleUnit;

        //double temp = (discountRate * 0.01); //
        double temp = (double)discountRate / 100; //
        double discountPrice = revenueBeforeDiscount * temp;
        double revenueAfterDiscount = revenueBeforeDiscount - discountPrice;

        System.out.println("The revenue from sale: " + revenueAfterDiscount + "$");
        System.out.println("Discount: " + discountPrice + " $(" + discountRate+".0%)");
    }
}
