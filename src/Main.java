public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] copyTo = new String[8];
        System.arraycopy(copyFrom, 3, copyTo, 4, 3);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}
