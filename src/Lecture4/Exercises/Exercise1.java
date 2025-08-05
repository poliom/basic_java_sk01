package Lecture4.Exercises;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arrayNumbers = {7,22,38,112,-8};
        int sum = 0;
        for (int number : arrayNumbers){
            sum = sum + number;
        }
        System.out.println("The sum of the elements in array is: " + sum);
    }
}
