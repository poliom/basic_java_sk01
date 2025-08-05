package Lecture2.LiveDemo;

public class AssignmentOperators {
    public static void main(String[] args) {
        int numberOne = 10;

        System.out.println("=: " + numberOne);
        System.out.println("+=: " + (numberOne+=5));
        System.out.println("-=: " + (numberOne-=6));
        System.out.println("*=: " + (numberOne*=2));
        System.out.println("/=: " + (numberOne/=3));
        System.out.println("%=: " + (numberOne%=2));
    }
}
