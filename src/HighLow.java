import java.util.Scanner;

public class HighLow {
    public static double getRandomDouble() {
        return Math.floor((Math.random() * (100 - 1 + 1)) + 1);
    }

    public static void game(int numToGuess) {
        Scanner sc = new Scanner(System.in);
        int userGuess = sc.nextInt();
        if (userGuess > 100 || userGuess < 0) {
            System.out.println("Emphasis on \"between 1 and 100.\"");
            game(numToGuess);
        }
        if (userGuess > numToGuess) {
            System.out.println("Lower...");
            game(numToGuess);
        } else if (userGuess < numToGuess) {
            System.out.println("Higher...");
            game(numToGuess);
        } else {
            System.out.printf("Congrats! The number is %d!\n", numToGuess);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Press \"Y\" to continue. \"N\" to quit.");
        String play = sc.next();
        if (play.equals("Y")) {
            System.out.println("Guess a number between 1 and 100.");
            int numToGuess = (int) getRandomDouble();
            game(numToGuess);
        } else {
            System.out.println("Goodbye!");
        }

    }
}
