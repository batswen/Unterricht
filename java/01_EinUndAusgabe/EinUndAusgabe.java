/*
Die Klasse Scanner muss per import-Anweisung importiert werden
*/

import java.util.Scanner;

public class EinUndAusgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eingabe;

        eingabe = scanner.nextLine();
        System.out.println("Sie haben " + eingabe + " geschrieben!");
        System.out.printf("Sie haben %s geschrieben!\n", eingabe);
    }
}
