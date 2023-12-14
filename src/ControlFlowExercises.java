import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
// todo Loop Basics*****************************************************************
// todo While ----------------------------------------------------------------------

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }


// todo Do While--------------------------------------------------------------------

//        Count by twos
//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i);
//        } while (i < 100);


//        Count down by fives
//        int i = 105;
//        do {
//            i -= 5;
//            System.out.println(i);
//        } while (i > -10);

//        Twos squared
//        int i = 2;
//        do {
//            System.out.println(i);
//            i = (int) Math.pow(i, 2);
//
//        } while (i < 1_000_000);

// todo For Loops ------------------------------------------------------------------

//        fives
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        twos
//        for (int i = 2; i < 1_000_000; i = (int) Math.pow(i, 2)) {
//            System.out.println(i);
//        }

//        FizzBuzz
//        for (int i = 0; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 != 0) ) {
//                System.out.println("Fizz");
//            } else if ((i % 3 != 0) && (i % 5 == 0)) {
//                System.out.println("Buzz");
//            } else if ((i % 3 == 0) && (i % 5 == 0) && (i != 0)) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Table of Powers
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an int: ");
//        int userInt = sc.nextInt();
//
//        System.out.printf("Here is your table based on the input: --> %d <--\n\n", userInt);
//
//        System.out.printf("number | squared | cubed\n");
//        System.out.printf("------ | ------- | -----\n");
//
//        int i = 1;
//
//        while (i <= userInt) {
//            int squared = i;
//            int cubed = i;
//            squared = (int) Math.pow(squared, 2);
//            cubed = (int) Math.pow(cubed, 3);
//            System.out.printf(" %d     | %d       | %d   \n", i, squared, cubed);
//            i++;
//        }

        System.out.println("Give a number between 0 and 100: ");
        int numGrade = sc.nextInt();
        System.out.printf("Your numGrade: %d\n", numGrade);
        System.out.println("Continue? [Y/N]");
        String userConfirm = sc.next();
        sc.nextLine();
        String grade = "";

        if (userConfirm.equals("y")) {
            if (numGrade >= 95 && numGrade <= 100) {
                grade = "A+";
            } else if (numGrade >= 90 && numGrade <= 94) {
                grade = "A";
            } else if (numGrade >= 88 && numGrade <= 89) {
                grade = "A-";
            } else if (numGrade >= 85 && numGrade <= 87) {
                grade = "B+";
            } else if (numGrade >= 82 && numGrade <= 84) {
                grade = "B";
            } else if (numGrade >= 80 && numGrade <= 81) {
                grade = "B-";
            } else if (numGrade >= 75 && numGrade <= 79) {
                grade = "C+";
            } else if (numGrade >= 70 && numGrade <= 74) {
                grade = "C";
            } else if (numGrade >= 67 && numGrade <= 69) {
                grade = "C-";
            } else if (numGrade >= 60 && numGrade <= 66) {
                grade = "D";
            } else if (numGrade >= 0 && numGrade <= 59) {
                grade = "F";
            } else {
                System.out.println("Invalid input!");
            }
            System.out.printf("Your grade is %s", grade);
        } else {
            System.out.println("Have a nice day!");
        }
    }
}
