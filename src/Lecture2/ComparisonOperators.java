package Lecture2;

public class ComparisonOperators {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 5;
        boolean equalTo = numberTwo == numberOne;
        boolean notEqualTo = numberTwo!=numberOne;
        boolean greaterThan = numberOne > numberTwo;
        boolean lessThan = numberOne < numberTwo;
        boolean greaterOrEqual = numberOne >= numberTwo;
        boolean lessOrEqual = numberOne <= numberTwo;

        System.out.println("equalTo: " + equalTo);
        System.out.println("notEqualTo: " + notEqualTo);
        System.out.println("greaterThan: " + greaterThan);
        System.out.println("lessThan: " + lessThan);
        System.out.println("greaterOrEqual: " + greaterOrEqual);
        System.out.println("lessOrEqual: " + lessOrEqual);
    }
}
