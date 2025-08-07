package Lecture5.LiveDemo;

public class MethodOverloadParameterNumbers {
    public static void main(String[] args) {
        int sideA = 1;
        int sideB = 12;
        double sideC = 25.5;
        double sideD = 33.9;

        System.out.println("Next is 2 sides sum");
        sumSides(sideA,sideB);
        System.out.println("Next is 3 sides sum");
        sumSides(sideA,sideB,sideD);
        System.out.println("Next is 4 sides sum");
        sumSides(sideA,sideB,sideC,sideD);
    }

    public static void sumSides(int sideA, int sideB){
        System.out.println("Here are our sides: " + sideA + " and " + sideB);
        System.out.println("The sum of two sides is: " + (sideA + sideB));
    }

    public static void sumSides(int sideA, int sideB, double sideC){
        System.out.println("Here are our sides: " + sideA + ", " + sideB + " and " + sideC);
        System.out.println("The sum of two sides is: " + (sideA + sideB + sideC));
    }

    public static void sumSides(int sideA, int sideB, double sideC, double sideD){
        System.out.println("Here are our sides: " + sideA + ", " + sideB + ", " + sideC + " and " + sideD);
        System.out.println("The sum of two sides is: " + (sideA + sideB + sideC + sideD));
    }
}
