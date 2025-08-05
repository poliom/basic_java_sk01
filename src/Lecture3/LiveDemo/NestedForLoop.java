package Lecture3.LiveDemo;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int row=0; row<=10; row++){
            int numberTwo = 10;
            for (int column=0; column<=3; column++){
                int number = 5;
                System.out.println("This is row: " + row);
                System.out.println("With column: " + column);
                System.out.println(number);
                System.out.println(numberTwo);
            }
            //System.out.println(number);
        }
    }
}
