import java.util.Scanner;

public class rockPaperScissors {

    public static String getChoice() {
        Scanner sc = new Scanner(System.in);
        int choice;
        String choiceStr = "";

        System.out.println("Rock=0, paper=1, scissors=2...");
        choice = sc.nextInt();
        return getChoice(choice);
    }

    public static String getChoice(int choice) {
        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else if (choice == 2) {
            return "Scissors";
        } else {
            System.out.println("Invalid response. Choose again");
            return getChoice();
        }
    }

    public static void game(String choiceStr, String computerChoiceStr, int userI, int computerI) {

        if (choiceStr.equals(computerChoiceStr)) {
            System.out.printf("You chose: %s\n", choiceStr);
            System.out.printf("Computer chose: %s\n", computerChoiceStr);
            System.out.println("It's a TIE!");
            System.out.printf("User: %d\n", userI);
            System.out.printf("Computer: %d\n", computerI);
        } else if (choiceStr.equals("Rock") && computerChoiceStr.equals("Paper")) {
            System.out.printf("You chose: %s\n", choiceStr);
            System.out.printf("Computer chose: %s\n", computerChoiceStr);
            System.out.println("You LOSE");
            computerI++;
            System.out.printf("User: %d\n", userI);
            System.out.printf("Computer: %d\n", computerI);
        } else if (choiceStr.equals("Rock") && computerChoiceStr.equals("Scissors")) {
            System.out.printf("You chose: %s\n", choiceStr);
            System.out.printf("Computer chose: %s\n", computerChoiceStr);
            System.out.println("you WIN");
            userI++;
            System.out.printf("User: %d\n", userI);
            System.out.printf("Computer: %d\n", computerI);
        } else if (choiceStr.equals("Paper") && computerChoiceStr.equals("Rock")) {
            System.out.printf("You chose: %s\n", choiceStr);
            System.out.printf("Computer chose: %s\n", computerChoiceStr);
            System.out.println("you WIN");
            userI++;
            System.out.printf("User: %d\n", userI);
            System.out.printf("Computer: %d\n", computerI);
        } else if (choiceStr.equals("Paper") && computerChoiceStr.equals("Scissors")) {
            System.out.printf("You chose: %s\n", choiceStr);
            System.out.printf("Computer chose: %s\n", computerChoiceStr);
            System.out.println("you LOSE");
            computerI++;
            System.out.printf("User: %d\n", userI);
            System.out.printf("Computer: %d\n", computerI);
        } else if (choiceStr.equals("Scissors") && computerChoiceStr.equals("Paper")) {
            System.out.printf("You chose: %s\n", choiceStr);
            System.out.printf("Computer chose: %s\n", computerChoiceStr);
            System.out.println("you WIN");
            userI++;
            System.out.printf("User: %d\n", userI);
            System.out.printf("Computer: %d\n", computerI);
        } else if (choiceStr.equals("Scissors") && computerChoiceStr.equals("Rock")) {
            System.out.printf("You chose: %s\n", choiceStr);
            System.out.printf("Computer chose: %s\n", computerChoiceStr);
            System.out.println("you LOSE");
            computerI++;
            System.out.printf("User: %d\n", userI);
            System.out.printf("Computer: %d\n", computerI);
        }

        Scanner sc = new Scanner(System.in);
        int play;
        int choice;
        int computerChoice;
        computerChoiceStr = "";
        System.out.println("Play again? [yes=1 / no=0]");
        play = sc.nextInt();

        if (play == 1) { // Starts game
            System.out.println("Rock=0, paper=1, scissors=2...");
            choice = sc.nextInt();
            choiceStr = getChoice(choice); // converts choice int to choice string.
            computerChoice = (int) Math.floor((Math.random() * (2 + 1)));
            computerChoiceStr = getChoice(computerChoice);
            game(choiceStr, computerChoiceStr, userI, computerI);
        } else {
            System.out.println("Have a nice day!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userI = 0;
        int computerI = 0;
        int play;
        int choice;
        int computerChoice;
        String choiceStr = "";
        String computerChoiceStr;
        System.out.println("Do you want to play Rock Paper Scissors? [1=yes / 0=no]");
        play = sc.nextInt();

        if (play == 1) { // Starts game
            System.out.println("Rock=0, paper=1, scissors=2...");
            choice = sc.nextInt();
            choiceStr = getChoice(choice); // converts choice int to choice string.
        } else {
            System.out.println("Have a nice day!");
        }

        computerChoice = (int) Math.floor((Math.random() * (2 + 1)));
        computerChoiceStr = "";

        computerChoiceStr = getChoice(computerChoice);

        game(choiceStr, computerChoiceStr, userI, computerI);
    }
}
