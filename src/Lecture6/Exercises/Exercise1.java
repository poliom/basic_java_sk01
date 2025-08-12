package Lecture6.Exercises;

public class Exercise1 {
    public static void main(String[] args) {
        double sideA = 12.23;
        double sideB = 12.23;
        double sideC = 12.23;
        if(!(isPositiveNumber(sideA) && isPositiveNumber(sideB) && isPositiveNumber(sideC))){
            System.out.println("Sides must be positive numbers");
        }
        else {
            if(canFormTriangleFromSides(sideA, sideB, sideC)){
                System.out.println("Triangle type is: " + triangleType(sideA, sideB, sideC));
                System.out.println("Triangle perimeter is: " + calculatePerimeter(sideA, sideB, sideC));
                System.out.println("Triangle area by Herons formulas is: " + calculateAreaHeronsFormula(sideA, sideB, sideC));
            }
            else {
                System.out.println("The triangle is invalid. Program is stopped.");
            }
        }
    }

    public static boolean canFormTriangleFromSides(double sideA, double sideB, double sideC){
        return (((sideA + sideB) > sideC) && ((sideA + sideC) > sideB) && ((sideC + sideB) > sideA));
    }

    public static String triangleType(double sideA, double sideB, double sideC){
        if (sideA == sideB && sideB == sideC){
            return "Equilateral";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return "Isosceles";
        }
        else {
            return "Scalene";
        }
    }

    public static boolean isPositiveNumber(double number){
        return number > 0;
    }

    public static double calculatePerimeter(double sideA, double sideB, double sideC){
        return sideA+sideB+sideC;
    }

    public static double calculateAreaHeronsFormula(double sideA, double sideB, double sideC){
        return (sideA+sideB+sideC)/2;
    }
}
