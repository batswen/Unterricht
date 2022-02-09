public class Doppelt {
    public static int doppelt(int zahl) {
        int ergebnis = 0;   // Nicht dieselbe Variable wie in main()
        ergebnis = 2 * zahl;
        return ergebnis;
    }
    public static int doppeltKurz(int zahl) {
        return 2 * zahl;
    }

    public static void main(String[] args) {
        int ergebnis = doppelt(5);
    }
}
