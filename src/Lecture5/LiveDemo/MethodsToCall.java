package Lecture5.LiveDemo;

public class MethodsToCall {
    public static void areNumbersEqual(int numberOne, int numberTwo){
        if (numberTwo == numberOne){
            System.out.println("Yes, numbers are equal");
        } else {
            System.out.println("No, numbers are different");
        }
    }
    public static void isNumberOneBiggerThanNumberTwo(int numberOne, int numberTwo){
        if (numberTwo < numberOne){
            System.out.println("Yes, number one is bigger than number two");
        } else {
            System.out.println("No,  number one is not bigger than number two");
        }
    }
}
