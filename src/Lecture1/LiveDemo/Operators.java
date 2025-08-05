package Lecture1.LiveDemo;

public class Operators {
    public static void main(){
        int numberOne = 100;
        int numberTwo = 30;

        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne / numberTwo);
        System.out.println(numberOne % numberTwo);
        System.out.println(++numberOne);
        System.out.println(--numberTwo);

        double numberDivision = (double) numberOne / numberTwo;
        System.out.println(numberDivision);
        System.out.println((double) numberOne / numberTwo);
    }
}
