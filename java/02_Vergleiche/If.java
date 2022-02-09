import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        int a = 0, b = 1;
        String text = "";

        /*
            Hinter IF muss eine Bedingung angegeben werden.
            Ist diese Wahr wird der folgende Block ausgeführt,
            ist sie falsch wird das Programm nach dem IF fortgesetzt.
        */
        if (a < b) {
            System.out.println("Wahr");
        }

        /*
            Gibt es ein ELSE, so kann auch der Falsch-Fall abgefangen
            werden.
            Es wird immer nur ein Block ausgeführt
        */
        if (a > b) {
            System.out.println("Wahr");
        } else {
            System.out.println("Falsch");
        }

        /*
            Der Bedingungsoperator (manchmal auch "Ternärer Operator", jedoch gibt es
            in anderen Sprachen z. B. in C++ mehrere Ternäre Operatoren)

            Bedingung ? Wahr : Falsch
        */
        if (b == 1) {
            a = 1;
        } else {
            a = 0;
        }
        // ist gleichbedeutent mit:
        a = b == 1 ? 1 : 0;


        text = a < b ? "a ist kleiner" : "b ist kleiner oder beide sind gleich";
        System.out.println(a == 0 ? "Hallo, Welt!" : "Hello, world!")
        /*
            Objekte können nicht mit diesen Operatoren verglichen
            werden. Hier muss man entsprechende Methoden aufrufen.

            Die String-Klasse bietet die Methoden
             .equals() // Vergleich der Zeichenketten
            bzw
             .equalsIgnoreCase()    // wie oben, aber Groß/Kleinschreibung
                                    // wird ignoriert
            an.
        */
        Scanner s = new Scanner(System.in);
        System.out.print("Bitte geben Sie das Passwort ein: ");
        String passwort = s.nextLine();

        if (passwort.equals("12345")) {
            System.out.println("Richtiges Passwort! Willkommen!");
        } else {
            System.out.println("Alaaaaarm!");
        }

        // oder

        System.out.println(passwort.equals("12345") ? "Richtig!" : "Alarm!");
    }
}
