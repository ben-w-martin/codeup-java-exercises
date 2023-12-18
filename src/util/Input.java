package util;

import java.util.Scanner;

public class Input {
    //    When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class.
    private String userInput;
    private int userMin;
    private int userMax;
    private int userInt;
    private double userDoubleMin;
    private double userDoubleMax;
    private double userDouble;


    public Input() {
        System.out.println("Type a string, a min, a max, and a number in between.");
        System.out.println("Type three decimal numbers, a min, a max, and a number in between.");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.next();
        userMin = scanner.nextInt();
        userMax = scanner.nextInt();
        userInt = scanner.nextInt();
        userDoubleMin = scanner.nextInt();
        userDoubleMax = scanner.nextInt();
        userDouble = scanner.nextDouble();
    }

    public String getString() {
        return userInput;
    }

    public boolean yesNo() {
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt() {
        return userInt;
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

    public double getDouble(double min, double max) {

        if (userDouble >= min && userDouble <= max) {
            System.out.printf("%f is within min: %f, and max %f.", userDouble, min, max);
            return userDouble;
        } else {
            System.out.printf("%f is NOT within min: %f, and max %f.", userDouble, min, max);
            return userDouble;
        }
    }

    public double getDouble() {
        return userDouble;
    }


//        String getString()
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
        System.out.println(newInput.getDouble(newInput.userMin, newInput.userMax));
    }

}
