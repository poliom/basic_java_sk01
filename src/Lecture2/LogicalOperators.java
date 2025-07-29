package Lecture2;

public class LogicalOperators {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 5;
        int numberX = 2;
        int numberY = 1;

        boolean equalNumberOneNumberX = numberX == numberOne;
        boolean equalNumberTwoNumberX = numberX == numberTwo;

        boolean greaterNumberOneNumberY = numberOne > numberY;
        boolean greaterNumberTwoNumberY = numberTwo > numberY;

        System.out.println("A && B true: " + (greaterNumberOneNumberY&&greaterNumberTwoNumberY) );
        System.out.println("A && B false: " + (equalNumberOneNumberX&&equalNumberTwoNumberX) );
        System.out.println("A || B true: " + (equalNumberOneNumberX||greaterNumberTwoNumberY) );
        System.out.println("A || B false: " + (equalNumberOneNumberX||equalNumberTwoNumberX) );


    }
}
