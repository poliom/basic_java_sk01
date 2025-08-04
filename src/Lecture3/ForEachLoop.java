package Lecture3;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {2, 25, 75, 351, 5};
        for(int number: numbers){
            System.out.println(number);
            if (number==75){
                System.out.println("This is my the number: " + number);
            }
        }

        String[] names = {"Mitko", "Vidko", "Pitko", "Ditko"};
        for (String name: names){
            System.out.println("My name is: " + name);
        }
    }
}
