import java.util.Scanner;

public class HighLow {
    public static double getRandomDouble() {
        return Math.floor((Math.random() * (100 - 1 + 1)) + 1);
    }

    public static void game(int numToGuess, int tracker) {
        Scanner sc = new Scanner(System.in);
        if (tracker == 0) {
            System.out.println("You ran out of guesses!");
            System.out.println("Play again? [y/n]");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("y")) {
                game(numToGuess, 10);
            } else {
                return;
            }
        }
        int userGuess = sc.nextInt();
        if (userGuess > 100 || userGuess < 0) {
            System.out.println("Emphasis on \"between 1 and 100.\"");
            System.out.printf("%d tries left.\n", tracker - 1);
            game(numToGuess, --tracker);
        }
        if (userGuess > numToGuess) {
            System.out.println("Lower...");
            System.out.printf("%d tries left.\n", tracker - 1);
            game(numToGuess, --tracker);
        } else if (userGuess < numToGuess) {
            System.out.println("Higher...");
            System.out.printf("%d tries left.\n", tracker - 1);
            game(numToGuess, --tracker);
        } else {
            System.out.printf("Congrats! The number is %d!\n", numToGuess);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Press \"Y\" to continue. \"N\" to quit.");
        String play = sc.next();
        int tracker = 10;
        if (play.equals("Y")) {
            System.out.println("Guess a number between 1 and 100.");
            int numToGuess = (int) getRandomDouble();
            game(numToGuess, tracker);
        } else {
            System.out.println("Goodbye!");
        }

    }
}
