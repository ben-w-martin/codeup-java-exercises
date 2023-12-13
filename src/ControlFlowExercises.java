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
        int i = 2;
        do {
            System.out.println(i);
            i = (int) Math.pow(i, 2);

        } while (i < 1_000_000);

    }
}
