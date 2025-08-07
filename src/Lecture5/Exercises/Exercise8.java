package Lecture5.Exercises;

public class Exercise8 {
    public static void main(String[] args) {
        int numberOne = 22;
        int numberTwo = 5;

        System.out.println("Is " + numberOne +" even? " + booleanToText(isEven(numberOne)));
        System.out.println("Is " + numberTwo +" even? " + booleanToText(isEven(numberTwo)));
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static String booleanToText(boolean boolStatement){
        if (boolStatement){
            return "Yes";
        }

        return "No";
    }
}
