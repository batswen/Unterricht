public class For {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("In der While-Schleife, i: " + i);
            i++;
        }
        System.out.println("Nach der While-Schleife, i: " + i);

        int j = 0;
        for (; j < 10;) {
            System.out.println("In der For-Schleife, j: " + j);
            j++;
        }
        System.out.println("Nach der For-Schleife, j: " + j);


        for (int k = 0; k < 10; k++) {
            System.out.println("In der For-Schleife, k: " + k);
        }
        System.out.println("Nach der For-Schleife, k: " + k);

        /*
        for(;;) {
            System.out.println("Endlosschleife")
        }
        */

        // Iterieren über ein Array
        int[] zahlen = {15, 20, 0, -5, 100};
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println("Index: " + i + ", Inhalt: " + zahlen[i]);
        }

        // Iterieren mit Hilfe der Foreach-Schleife
        for (int zahl: zahlen) {
            System.out.println("Inhalt: " + zahl);
        }

        // Ausgabe aller Argumente (iteration über args[])
        for (String arg: args) {
            System.out.println(arg);
        }
    }
}
