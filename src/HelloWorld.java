public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World.");

        long myFavoriteNumber = 4;
        long myLongNum = 20L;
        System.out.println(myLongNum);
        System.out.println(myFavoriteNumber);

        String myString = "This is meh strang.";
        System.out.println(myString);

        float myNumber;
//        myNumber = 123;
        myNumber = 3.14F;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int class = 25;
//        System.out.println(CLASS);

//        byte theNumberThree = 3;
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        System.out.println(x);
        System.out.println(y);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }
}
