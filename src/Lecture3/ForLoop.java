package Lecture3;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Start");
        int number = 10;
        int numberTwo = 1;
        int sum = 0;
        for (int i=0; i<10; i++, number--){
            System.out.println(number);
            sum = sum + number + numberTwo;
            System.out.println(sum);
            //System.out.println(i);
        }
        System.out.println("Finish");
    }
}

