public class Print {
    public static void main(String[] args) {
        // Ausgabe mit Zeilenvorschub
        System.out.println("Ausgabe mit Zeilenvorschub");
        System.out.println("Ausgabe mit Zeilenvorschub");
        System.out.println("Ausgabe mit Zeilenvorschub");

        // Ausgabe ohne Zeilenvorschub
        System.out.print("Ausgabe ohne Zeilenvorschub");
        System.out.print("Ausgabe ohne Zeilenvorschub");
        System.out.print("Ausgabe ohne Zeilenvorschub");
        System.out.println();

        // Ausgabe mit Escapezeichen (% bzw \)
        System.out.printf("Zeichen: %c, Zeichenkette: %s, Int: %d\n", 'a', "Xyz", 45054);
        System.out.printf("Int (Hex): %h\n", 45054);
        System.out.println();

        System.out.printf("Zeichenkette (Groß): '%S'\n", "das ist mal ein text");
        System.out.printf("Zeichenkette (mindestgröße/rechtsbündig): '%10s'\n", "abcde");
        System.out.printf("Zeichenkette (mindestgröße/rechtsbündig): '%10s'\n", "abcdeghijklmnopqrstuvwxyz");
        System.out.printf("Zeichenkette (linksbündig): '%-10s'\n", "abcde");
        System.out.println();

        System.out.printf("Float/Double: %f\n", 45054.292929);
        System.out.printf("Float/Double: %7.2f\n", 45054.292929);
    }
}
