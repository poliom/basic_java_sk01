package Lecture2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select channel");
        int menuOption = scanner.nextInt();

        System.out.println("SwitchCase-----------------");
        switch (menuOption){
            case 1:
                System.out.println("Channel 1");
                break;
            case 2:
                System.out.println("Channel 2");
                break;
            case 3:
                System.out.println("Channel 3");
                break;
            case 4:
                System.out.println("Channel 4");
                break;
            case 5:
                System.out.println("Channel 5");
                break;
            default:
                System.out.println("Not supported channel");
        }
        System.out.println("IfElse-----------");
        if (menuOption == 1){
            System.out.println("Channel 1");
        }
        else if (menuOption==2){
            System.out.println("Channel 2");
        }
        else if (menuOption==3){
            System.out.println("Channel 3");
        }
        else if (menuOption==4){
            System.out.println("Channel 4");
        }
        else {
            System.out.println("Not supported channel");
        }

        System.out.println("Please enter month");
        int month = scanner.nextInt();
        switch(month) {
            case 1:
            case 3:
            case 5:
                System.out.println("Days are: 31");
                break;
            case 2:
                System.out.println("Please tell me if the year is leap or not. Use yes or no");

                String isLeapYear= scanner.next();
                isLeapYear = isLeapYear.toLowerCase();

                if (isLeapYear.equals("yes")){
                    System.out.println("Days are: 29");
                }
                else {
                    System.out.println("Days are: 28");
                }
                break;
            case 4, 6, 9, 11:
                System.out.println("Days are: 30");
                break;
            default:
                System.out.println("Please enter correct month");
                ;
        }
        System.out.println("Program workflow");
    }

}
