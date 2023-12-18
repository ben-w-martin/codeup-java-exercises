package util;

import java.util.Scanner;

public class Input {
    //    When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class.
    private String userInput;
    private int userMin;
    private int userMax;
    private int userInt;


    public Input() {
        System.out.println("Type a string, a min, a max, and a number in between.");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.next();
        userMin = scanner.nextInt();
        userMax = scanner.nextInt();
        userInt = scanner.nextInt();
    }

    public String getString() {
        return userInput;
    }

    public boolean yesNo() {
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {

        if (userInt >= min && userInt <= max) {
            System.out.printf("%d is within min: %d, and max %d.", userInt, min, max);
            return userInt;
        } else {
            System.out.printf("%d is NOT within min: %d, and max %d.", userInt, min, max);
            return userInt;
        }
    }

    public int getInt() {
        return userInt;
    }

//        String getString() **
//        boolean yesNo()
//        int getInt(int min, int max)
//        int getInt()
//        double getDouble(double min, double max)
//        double getDouble()

    public static void main(String[] args) {
        Input newInput = new Input();
        System.out.println(newInput.getString());
        System.out.println(newInput.yesNo());
        System.out.println(newInput.getInt());
        System.out.println(newInput.getInt(newInput.userMin, newInput.userMax));
    }

}
