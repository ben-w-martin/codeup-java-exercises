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
//    public static int multiplyRecursive(int x, int y) {
//        if (y == 1) {
//            System.out.println("base");
//            return x;
//        } else if (y == -1) {
//            return -x;
//        }
//        if (y > 0) {
//            System.out.printf("cond 1: %d\n",  x + multiplyRecursive(x, y - 1));
//            return x + multiplyRecursive(x, y - 1);
//        } else if (x < 0 && y < 0) {
//            System.out.printf("cond 2: %d\n", x + multiplyRecursive(x, y + 1));
//            return x + multiplyRecursive(x, y + 1);
//        } else if (y < 0) {
//            System.out.printf("cond 3: %d\n", x + multiplyRecursive(x, y + 1));
//            return multiplyRecursive(x, y + 1) - x;
//        } else {
//            return 0;
//        }
//    }

    // 2 GET INTEGER********************************************************************
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.printf("%d is between %d and %d.", userInput, min, max);
            return userInput;
        } else {
            return getInteger(1, 10);
        }
    }

    // MAIN*****************************************************************************
    public static void main(String[] args) {

//      ARITHMETIC
        System.out.println(add(4, 5));
        System.out.println(subtract(19, 4));
        System.out.println(multiply(16, 29));
        System.out.println(divide(56, 11));
        System.out.println(modulus(132, 19));
        System.out.println(multiplyManual(16, 17));
//        System.out.println(multiplyRecursive(-5, -7));
        getInteger(1, 10);
    }
}
