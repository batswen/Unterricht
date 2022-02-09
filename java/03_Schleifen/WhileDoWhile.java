public class While {
    public static void main(String[] args) {

        // Die While-Schleife (auch kopfgesteuerte Schleife)

        int i = 0;
        while (i < 10) {
            System.out.println("In der While-Schleife, i: " + i);
            i++;
        }
        System.out.println("Nach der While-Schleife, i: " + i);


        /*
        // Wird die Bedingung nicht erfüllt, bricht die Schleifenausführung nie
        // ab, hierbei spricht man von einer Endlosschleife

        boolean weiter = true;
        while (weiter) {
            System.out.println("Endlosschleife");
        }
        */

        // Die Do-While-Schleife (Fußgesteuerte Schleife)

        i = 0;
        do {
            System.out.println("In der Do-While-Schleife, i: " + i);
            i++;
        } while (i < 10);
        System.out.println("Nach der Do-While-Schleife, i: " + i);
    }
}
