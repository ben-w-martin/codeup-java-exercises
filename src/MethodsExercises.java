import java.util.Scanner;

public class MethodsExercises {
    // 1 ARITHMETIC*********************************************************************
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static float divide(float x, float y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

    //  Bonus *
    public static int multiplyManual(int x, int y) {
        int product = 0;
        for (int i = 0; i < y; i++) {
            product += x;
        }
        return product;
    }

    // Bonus Recursive **
    public static int multiplyRecursive(int x, int y) {
        if (y == 1) {
            System.out.print("product: ");
            return x;
        } else if (x == -1) {
            System.out.print("product: ");
            return y * -1;
        }
        if (y > 0) {
            return x + multiplyRecursive(x, y - 1);
        } else if (y < 0) {
            return multiplyRecursive(y, x + 1) - y;
        } else {
            return 0;
        }
    }

    // 2 GET INTEGER********************************************************************
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input >= min && input <= max) {
            System.out.printf("%d is between %d and %d.\n", input, min, max);
            return input;
        } else {
            System.out.println("Enter a number between 1 and 10: ");
            return getInteger(1, 10);
        }
    }

    // 3 FACTORIAL**********************************************************************
    public static long getFactorial(long num) {
        if (num == 1) {
            System.out.println("The factorial is:");
            return num;
        }
        return num * getFactorial(num - 1);
    }

    // 4 DICE***************************************************************************
    public static double getRandomDouble(double min, double max) {
        return Math.floor((Math.random() * (max - min + 1)) + min);
    }

    public static void rollDice(double sides) {
        Scanner sc = new Scanner(System.in);
        int die1 = (int) getRandomDouble(1, sides);
        int die2 = (int) getRandomDouble(1, sides);
        System.out.println("Roll the Dice? [y/n]");
        String resp = sc.next();
        sc.nextLine();
        if (resp.equalsIgnoreCase("y")) {
            System.out.printf("Die 1: %d\nDie 2: %d\n", die1, die2);
            System.out.println("Roll again? [y/n]. Type response and number of sides\n separated with a space.");
            String again = sc.next();
            int nextSides = Integer.parseInt(sc.next());
            if (again.equalsIgnoreCase("y")) {
                rollDice(nextSides);
            }
        } else {
            System.out.println("Maybe next time.");
        }
    }

    // MAIN*****************************************************************************
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      ARITHMETIC
        System.out.println("ARITHMETIC________________________________");
        System.out.println(add(4, 5));
        System.out.println(subtract(19, 4));
        System.out.println(multiply(16, 29));
        System.out.println(divide(56, 11));
        System.out.println(modulus(132, 19));
        System.out.println(multiplyManual(16, 17));
        System.out.println(multiplyRecursive(4, -9));

//      GET INT
        System.out.println("GET INT__________________________________");
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);

//      FACTORIAL
        System.out.println("FACTORIAL________________________________");
        System.out.println("Do you wish to continue? [Y/N]");
        String conf = sc.next();
        sc.nextLine();
        if (conf.equalsIgnoreCase("y")) {
            System.out.println("Enter a number between 1 and 10: ");
            System.out.println(getFactorial(getInteger(1, 10)));
        }

//      FACTORIAL BONUS

//      DICE
        System.out.println("ROLL DICE________________________________");
        System.out.println("Pick a number of sides for your dice.");
        double sides = sc.nextDouble();

        rollDice(sides);

    }
}
