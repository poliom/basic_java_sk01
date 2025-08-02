package Lecture3;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i=3; i<10; i++){
            System.out.println("-------------------");
            System.out.println("1. Next code will be shown always and number is" + i);
            if (i<7){
                System.out.println("2. Number is less than 7 and number is: " + i);
                continue;
            }

            if (i<10){
                System.out.println("3. Number is less than 10 and number is: " + i);
            }

            System.out.println("4. Number is > or = 3 and number is: " + i);
            System.out.println("-------------------");
        }

        int numberTwo = 6;
        while (numberTwo < 54) {
            numberTwo += 13;
            System.out.println("1. Number is: " + numberTwo);
            if (numberTwo < 33) {
                System.out.println("2. Number is less than 33");
                continue;
            }
            if (numberTwo < 52) {
                System.out.println("3. Number is less than 52");
                continue;
            }
            System.out.println("4. Number is bigger than 54");
        }
    }
}
