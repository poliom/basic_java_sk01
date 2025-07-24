package Lecture1.MyFirstPackage;

public class DatatypesCasting {
    public static void main(){
        byte firstByte = 10;
        short firstShort = firstByte;
        int firstInt = firstByte;
        int secondInt = firstShort;
        char firstChar = '1';
        System.out.println("Byte: " + firstByte);
        System.out.println("Short: " + firstShort);
        System.out.println("First Int: " + firstInt);
        System.out.println("Second Int: " + secondInt);
        System.out.println("First Char: " + firstChar);
        System.out.println("-----------------------");
        double firstDouble = 123456.789;
        float firstFloat = (float) firstDouble;
        long firstLong = (long) firstFloat;
        int firstIntNumber = (int) firstLong;
        byte firstByteNumber = (byte) firstIntNumber;
        System.out.println("First Double: " + firstDouble);
        System.out.println("First Float: " + firstFloat);
        System.out.println("First Long: " + firstLong);
        System.out.println("First Int Number: " + firstIntNumber);
        System.out.println("Byte: " + firstByteNumber);

    }
}
