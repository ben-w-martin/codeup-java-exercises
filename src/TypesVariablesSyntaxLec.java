public class TypesVariablesSyntaxLec {
    public static void main(String[] args) {
        System.out.println("This is ex. of a statement.");
        System.out.println("Note. ends w/ a semi-colon");
        System.out.println("Must end with semi-colon dang it.");
        System.out.println("Java B gettin mad.");

        int smallNum = 19;
        System.out.println(smallNum);
        smallNum = 127;
        smallNum++;
        System.out.println(smallNum);

        int numDefault;
            numDefault = 0; // you MUST set a value for a variable before accessing it. i.e.: no default value.
        System.out.println(numDefault);

        char firstLetterOfBen = 'B';

        String message = "I'm a creep. I'm a weirdo-o-o";
        String quote = "\"Better out than in, I always say.\" - Shrek, but also Joe Stephens...";
        System.out.println(message);
        System.out.println(quote);

        final String EMPEROR_OF_IMUGI = "David \"Lord Megatron\" Stephens";
        System.out.println(EMPEROR_OF_IMUGI);
    }
}
