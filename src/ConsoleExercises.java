import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // Declarations*************************************************************
        double pi = 3.14159;
        int nextInt;
        String string1;
        String string2;
        String string3;
        String sentence;
        String lengthStr;
        String widthStr;
        float length;
        float width;
        float perimeter;
        float area;

        // Console******************************************************************
        System.out.format("The value of pi is approximately %.2f.\n", pi);

        // todo Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        //   * What happens if you input something that is not an integer?
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an int: ");
        nextInt = sc.nextInt();
        System.out.println("Your int is --> " + nextInt +" <--");

        // todo Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        //  * What happens if you enter less than 3 words?
        //  * What happens if you enter more than 3 words?
        System.out.print("Enter 3 words, separated by spaces: ");
        string1 = sc.next();
        string2 = sc.next();
        string3 = sc.next();

        sc.nextLine(); // consumes newline caused by "Enter" press

        System.out.println("Your first word is: --> " + string1 +" <--");
        System.out.println("Your second word is: --> " + string2 +" <--");
        System.out.println("Your third word is: --> " + string3 +" <--");

        // todo Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        //  * do you capture all the words?

        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();

        System.out.println("Your sentence says: --> " + sentence +" <--");

        // todo Prompt the user to enter values of lengthStr and widthStr of a classroom at Codeup (or your room if virtual).
        //  * Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the lengthStr and again to get the user input for the widthStr. Parse the resulting strings to a numeric type.
        //  * Assume that the rooms are perfect rectangles.
        //  * Assume that the user will enter valid numeric data for lengthStr and widthStr.

        System.out.print("Enter the length of your classroom/office: ");
        lengthStr = sc.nextLine();
        System.out.print("Enter the width of your classroom/office: ");
        widthStr = sc.nextLine();
        length = Float.parseFloat(lengthStr);
        width = Float.parseFloat(widthStr);

        // todo Display the area and perimeter of that classroom.
        //  * The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        perimeter = (length * 2) + (width * 2);
        area = length * width;

        System.out.println("Your classroom perimeter is: --> " + perimeter +" <--");
        System.out.println("Your classroom area is: --> " + area +" <--");
    }
}
