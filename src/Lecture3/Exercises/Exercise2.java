package Lecture3.Exercises;

public class Exercise2 {
    public static void main(String[] args) {
        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int number : list1){
            if (number>150){
                break;
            }
            if (number%5==0){
                System.out.println("Number " + number + " is divisible to 5");
            }
        }
    }
}
