# Funktionen
Mit Hilfe von Funktionen können Programme in kleinere, wiederverwendbare Einheiten unterteilt werden. Funktionen können lokale Variablen besitzen, diese existieren nur bis die Funktion beendet wird.

## Funktionsdefinition
```JAVA
// Java
static [Datentyp] [Funktionsname]([Liste der formalen Paramter]) {
    [Funktionsinhalt]
}
```

```PYTHON
# Python
def [Funktionsname]([Liste der formalen Paramter]):
    [Funktionsinhalt]
```

### Beispiel
```JAVA
// Java (Ausschnitt)
static int doppelt(int zahl) {
    return 2 * zahl;
}

// ...
int i = 1234567;
System.out.println("Das Doppelte von " + i + " ist " + doppelt(i));
// Ausgabe: "Das Doppelte von 1234567 ist 2469134"
```

```PYTHON
# Python
def doppelt(zahl):
    return 2 * zahl

# ...
i = 1234567
print("Das Doppelte von {} ist {}".format(zahl, doppelt(zahl)))

# --------
def benannte_parameter(x, y, z):
    print(x, y, z)

# Aufruf mit Positionsargumenten
benannte_parameter(1, 2, 3) # x=1, y=2, z=3

# Aufruf mit benannten Argumenten
benannte_parameter(x = 3, y = 5, z = 10) # x=3, y=5, z=10

# Aufruf mit benannten Argumenten, beliebige Reihenfolge
benannte_parameter(z = 3, x = 5, y = 10) # x=5, y=10, z=3

#
def parameter_mit_vorgabe(x, y = 0):
    print(x, y)

parameter_mit_vorgabe(1, 2) # x=1, y=2
parameter_mit_vorgabe(1)    # x=1, y=0
parameter_mit_vorgabe(x = 1)# x=1, y=0
```

Funktionen in Python können jeden beliebigen Datentyp zurückgeben. Es sind also auch z. B. Arrays erlaubt. Wird vom Array nur ein bestimmter Index benötigt, so kann man diesen an den Funktionsaufruf anhängen.

```PYTHON
def ret_array():
    return [1, 2, 3]

print(ret_array()) # gibt "[1, 2, 3]" aus, also das komplette Array
print(ret_array()[1]) # gibt "2" aus - nur den zweiten Eintrag (Index: 1)
```

```PYTHON
def viele_ergebnisse():
    return [0, "Eins", ["A", "B", "C"], True]

print(viele_ergebnisse())       # [0, 'Eins', ['A', 'B', 'C'], True]
print(viele_ergebnisse()[0])    # 0
print(viele_ergebnisse()[2][0]) # A
```

Vorgabeparameter gibt es seit ES2015 auch bei Javascript. Der Internet Explorer unterstützt diesen Standard nicht.

## Nochmal der Kurzschluß
```JAVA
// Java
public class Kurzschluß {
    static boolean eins() {
        System.out.println("Eins");
        return true; // Ändern in "return false;"
    }
    static boolean zwei() {
        System.out.println("Zwei");
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Main");
        if (eins() && zwei()) {
            System.out.println("Wahr");
        } else {
            System.out.println("Falsch");
        }
    }
}
/*
    Ausgabe (vor Änderung):
    Main
    Eins
    Zwei
    Wahr

    Ausgabe (nach Änderung):
    Main
    Eins
    Falsch
*/
```

```PYTHON
# Python
def eins():
    print("Eins")
    return True # Ändern in "return False"

def zwei():
    print("Zwei")
    return True

print("Main")
if eins() and zwei():
    print("Wahr")
else:
    print("Falsch")

# Ausgabe (vor Änderung):
# Main
# Eins
# Zwei
# Wahr

# Ausgabe (nach Änderung):
# Main
# Eins
# Falsch
```
