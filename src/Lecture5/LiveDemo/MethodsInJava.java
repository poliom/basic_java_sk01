package Lecture5.LiveDemo;

import java.util.ArrayList;

public class MethodsInJava {
    public static void main(String[] args) {
        printMessages();

        int numberA = 10;
        int numberB = 20;
        MethodsInJava.sumOfTwoNumbersAndPrintResult(numberA, numberB);
        MethodsToCall.areNumbersEqual(numberA, numberB);
        MethodsToCall.isNumberOneBiggerThanNumberTwo(numberA, numberB);
        System.out.println("Sum of number " + numberA + " and the PI number is: " + sumOfNumbersAndPi(numberA));
        System.out.println("Sum of number " + numberB + " and the PI number is: " + sumOfNumbersAndPi(numberB));
        System.out.println("Sum of A and B numbers and the number PI is: " + sumOfNumbersAndPi(numberA, numberB));

        int numberC = 22;
        int numberD = 40;
        sumOfTwoNumbersAndPrintResult(numberC, numberD);
        MethodsToCall.areNumbersEqual(numberC, numberD);
        MethodsToCall.isNumberOneBiggerThanNumberTwo(numberC, numberD);
        System.out.println("Sum of number " + numberC + " and the PI number is: " + sumOfNumbersAndPi(numberC));
        System.out.println("Sum of number " + numberD + " and the PI number is: " + sumOfNumbersAndPi(numberD));

        int numberE = 42;
        int numberF = 42;
        int sumEF = sumOfTwoNumbersAndPrintResult(numberE, numberF);
        MethodsToCall.areNumbersEqual(numberE, numberF);
        MethodsToCall.isNumberOneBiggerThanNumberTwo(numberE, numberF);
        System.out.println("Sum of number " + numberE + " and the PI number is: " + sumOfNumbersAndPi(numberE));
        System.out.println("Sum of number " + numberF + " and the PI number is: " + sumOfNumbersAndPi(numberF));

        int numberM = 150;
        int numberN = 230;
        int sumMN = sumOfTwoNumbersAndPrintResult(numberM, numberN);
        MethodsToCall.areNumbersEqual(numberM, numberN);
        MethodsToCall.isNumberOneBiggerThanNumberTwo(numberM, numberN);
        System.out.println("Sum of number " + numberM + " and the PI number is: " + sumOfNumbersAndPi(numberM));
        System.out.println("Sum of number " + numberN + " and the PI number is: " + sumOfNumbersAndPi(numberN));

        System.out.println("The sum of number M and N is: " + sumMN);
        System.out.println("The sum of number E and F is: " + sumEF);

        double numberK = 10.69;
        double numberL = 230.124;
        double sumKL = sumOfTwoNumbersAndPrintResult(numberK, numberL);
        System.out.println("Sum of K and L numbers and the number PI is: " + sumOfNumbersAndPi(numberK, numberL));
        System.out.println("The sum of number K and L is: " + sumKL);
    }
    public static int sumOfTwoNumbersAndPrintResult(int numberOne, int numberTwo){
        int sum = numberOne + numberTwo;
        System.out.println("The sum is: " + sum);
        return sum;
    }
    public static double sumOfTwoNumbersAndPrintResult(double numberOne, double numberTwo){
        double sum = numberOne + numberTwo;
        System.out.println("The sum is: " + sum);
        System.out.println("This method is overloading the int one, but use doubles");
        return sum;
    }
    public static double sumOfNumbersAndPi(int number){
        System.out.println("Start scope of sumOfNumberAndPi");

        double sumOfNumberAndPi = Math.PI + number;

        System.out.println("End scope of sumOfNumberAndPi");

        return sumOfNumberAndPi;
    }
    public static double sumOfNumbersAndPi(double number, double numberTwo){
        System.out.println("Start scope of sumOfNumberAndPi");

        double sumOfNumberAndPi = Math.PI + number + numberTwo;

        System.out.println("End scope of sumOfNumberAndPi");

        return sumOfNumberAndPi;
    }
    public static double sumOfNumbersAndPi(int number, int numberTwo){
        System.out.println("Start scope of sumOfNumberAndPi");

        double sumOfNumberAndPi = Math.PI + number + numberTwo;

        System.out.println("End scope of sumOfNumberAndPi");

        return sumOfNumberAndPi;
    }

    public static void printMessages(){
        System.out.println("Start scope printMessages");
        int number = 10;
        System.out.println(sumOfNumbersAndPi(number));
        double numberTwo = 24.5;
        System.out.println(numberTwo);
        System.out.println("Stop scope printMessages");
    }
}
