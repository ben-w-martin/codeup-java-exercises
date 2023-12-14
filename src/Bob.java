import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Say something to Bob...");
            String toBob;
            toBob = sc.nextLine();
            if (toBob.endsWith("?")) {
                System.out.println("Bob says: \"Sure.\"");
            } else if (toBob.endsWith("!")) {
                System.out.println("Bob says: \"Whoa, chill out!\"");
            } else if (toBob.equals("")) {
                System.out.println("Bob says: \"Fine. Be that way!\"");
            } else {
                System.out.println("Bob says: \"Whatever.\"");
            }
            System.out.println("Continue speaking with Bob? [Y/N]");
            if (sc.next().equalsIgnoreCase("n")) {
                System.out.println("Bob says: \"Totally brah!\"");
                break;
            }
            sc.nextLine();
        }
    }
}
