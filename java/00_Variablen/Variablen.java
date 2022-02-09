public class Variablen {
    public static void main(String[] args) {
        int a, b = 0;           // nur b erhält den Wert Null, a ist nicht definiert
        float komma = 123.456f; // Kommazahlen im Quelltext sind immer Double!
        double zahl = 123.456;
        String text = "Beliebig langer Text";
        char c = '?';
        boolean richtig = true;

        // Deklaration eines Arrays
        int[] zahlen = {15, 20, 0, -5, 100};
        int ersteZahl = zahlen[0];
        int letzteZahl = zahlen[zahlen.length - 1];
    }
}

/*
    * Es können mehrere Variablen durch Komma getrennt deklariert werden
    * Bei der Deklaration kann bereits ein Wert zugewiesen werden
*/
