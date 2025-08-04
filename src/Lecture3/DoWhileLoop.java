package Lecture3;

public class DoWhileLoop {
    public static void main(String[] args) {
        int number = 2;

        do {
            number++;
            System.out.println(number);
            number+=2;
            System.out.println(number);
            System.out.println("Finish");
        }while (number>10);

        System.out.println("End of Code");
    }
}
