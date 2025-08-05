package Lecture4.LiveDemo;

public class Array {
    public static void main(String[] args) {
        int[] numberArray = new int[6];
        int[] arrayNumbers = {5,6,7,8,9};

        System.out.println("Array length 1: " + numberArray.length);
        System.out.println("Array length 2: " + arrayNumbers.length);

        for (int number : numberArray){
            System.out.println("Array 1 current number is: " + number);
        }

        for (int number : arrayNumbers){
            System.out.println("Array 2 current number is: " + number);
        }

        numberArray[0] = 5;
        numberArray[1] = 8;
        numberArray[3] = 10;
        numberArray[2] = 15;
        numberArray[5] = 4;
        numberArray[4] = 100;

        arrayNumbers[2] = 110;

        System.out.println("--------After update values---------");

        for (int number : numberArray){
            System.out.println("Array 1 current number is: " + number);
        }

        for (int number : arrayNumbers){
            System.out.println("Array 2 current number is: " + number);
        }
    }
}
