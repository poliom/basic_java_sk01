package Lecture4.Exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int[][] multiArray = {
                {5,4,6,8},  // 0 row
                {1,9,11,2}, // 1 row
                {3,7,12,10} // 2 row
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter row:");
        int row = scanner.nextInt();
        System.out.println("Please enter column:");
        int column = scanner.nextInt();

        if (row<0){
            System.out.println("Negative rows are not supported");
        }
        else if (column<0){
            System.out.println("Negative column are not supported");
        }
        else if (row>multiArray.length){
            System.out.println("We don`t have row: " + row);
        }
        else if (column>multiArray[row].length){
            System.out.println("We don`t have column: " + column);
        }
        else {
            System.out.println("The value for row " + row + " and column " + column + " is: " + multiArray[row][column]);
        }
    }
}
