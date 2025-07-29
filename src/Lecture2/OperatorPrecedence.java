package Lecture2;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 20;
        int numberX = 10;

        System.out.println("Execute postfix(after) NumberOne: " + numberOne++);
        System.out.println("NumberOne after postfix: " + numberOne++);
        System.out.println("numberOne: "+ numberOne);
        System.out.println("Execute increment(before)" + ++numberOne);
        System.out.println("Second Execute increment(before)" + ++numberOne);

        System.out.println("Exete unary NumberOne: " + --numberOne);
        System.out.println("Second NumberOne unary: " + --numberOne);

        System.out.println("Operation Priority: " + (numberX + numberTwo * numberTwo - (numberTwo / numberX)));
    }
}
