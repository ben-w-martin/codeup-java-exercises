import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
//        System.out.println("I'm a message.");
//        System.out.println("I'm a message on the next line.");
//
//        System.out.print("I'm another message. ");
//        System.out.print("I'm another message on the next line.");

        System.out.printf("What dis is?\n");

        String student = "ben";
        int favNum = 4;
        float pi = 3.14F;
        System.out.printf("Hello, my name is %s, and my favorite numbers are %d and %.2f. Lez be frens... %n", student, favNum, pi);
//        System.out.printnl("Hello, my name is " + student + ", and my favorite numbers are " + favNum +" and " + pi + ". Lez be frens... %n");
        System.out.println("Same line or nah?");

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter some number: ");
        int userInt = scanner.nextInt(); // capture input from user;

        System.out.println("You entered: --> \"" + userInt + "\" <--");

        System.out.print("Enter some number (incl. floats): ");
        Double userDbl = scanner.nextDouble(); // capture input from user;

        System.out.println("You entered: --> \"" + userDbl + "\" <--");

        // -------------------------------------------------------------------------

        System.out.print("Enter something: ");
        String userInput = scanner.next(); // capture input from user;

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.println("Enter something else: ");
        scanner.nextLine();
        String userInputOther = scanner.nextLine(); // capture input from user;

        System.out.println("You entered: --> \"" + userInputOther + "\" <--");
    }
}

