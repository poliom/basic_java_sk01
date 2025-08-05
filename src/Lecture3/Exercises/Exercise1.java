package Lecture3.Exercises;

public class Exercise1 {
    public static void main(String[] args) {
        // int[] numbers = {5,91,65,4,23,56};
        // int[] numbers = {7, -36, 9, 8, 144};
        // int[] numbers = {7,91,144,144,8};
        int[] numbers = {-154,-7,-91,-144,-8};

        int biggestNumber = numbers[0];
        for (int number : numbers){
            if (biggestNumber < number){
                biggestNumber = number;
            }
        }
        System.out.println("V1: The biggest number is: " + biggestNumber);

        int biggestNumberFor = numbers[0];
        for (int i=0; i<numbers.length; i++){
            if (i==0){
                biggestNumberFor = numbers[i];
                continue;
            }
            if(biggestNumberFor < numbers[i]){
                biggestNumberFor = numbers[i];
            }
        }
        System.out.println("V2: The biggest number is: " + biggestNumberFor);
    }
}
