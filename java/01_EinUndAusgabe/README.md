# Ein- und Ausgabefunktionen

## Ausgabe in die Konsole
Die Ausgabe geschieht mit Hilfe von System.out.print / printf / println.
```JAVA
// Java

System.out.print();     // Gibt nur die angegebenen Daten aus
System.out.println();   // Gibt zusätzlich einen Zeilenvorschub aus
System.out.printf();    // Erlaubt es die Ausgabe zu formatieren
```

Bei Python kann man für jeden dieser Fälle die print()-Funktion verwenden.
```PYTHON
# Python

print(end="")   # Gibt nur die angegebenen Daten aus
print()         # Gibt zusätzlich einen Zeilenvorschub aus
```
## Eingabe
Um Eingaben von der Konsole zu lesen, kann die Scanner-Klasse verwendet werden.
```JAVA
// Java

// Import der Scanner-Klasse
import java.util.Scanner;

// Nutzbarmachung
Scanner scanner = new Scanner(System.in);

// Verwendung (Aufruf der Eingabemethode)
String eingabe = scanner.nextLine();

/*
    Die Scanner-Klasse bietet verschiedene Methoden an:
        .nextLine()     (String)    Liest eine Zeile ein
        .nextInt()      (Int)       Liest eine Integerzahl ein
        .nextFloat()    (Float)     Liest eine Fließkommazahl ein
        .nextDouble()   (Double)
        .nextBoolean()  (Boolean)
        .nextLong()     (Long)
        .nextShort()    (Short)
*/
```

```PYTHON
#Python

eingabe = input("Eingabe: ")
```
