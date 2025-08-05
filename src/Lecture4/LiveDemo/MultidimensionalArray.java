package Lecture4.LiveDemo;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] multiArray = {
                {5,4,6,8},  // 0 row
                {1,9,11,2}, // 1 row
                {3,7,12,10} // 2 row
        };

        for (int row = 0; row<multiArray.length; row++){
            // System.out.println("Value of row is: " + row);
            // row = row+5;
            for (int culm = 0; culm<multiArray[row].length; culm++){
                System.out.println("Value of row " + row + " and culm " + culm + " is: " + multiArray[row][culm]);
            }
        }
        System.out.println("Custom Value of row 2 and culm 3 is: " + multiArray[2][3]);
        System.out.println("Custom Value of row 4 and culm 3 is: " + multiArray[4][3]);
    }
}
