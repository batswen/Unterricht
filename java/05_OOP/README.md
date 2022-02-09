# Klassen, Methoden und Objekte

## Klassen

```
JAVA:
class [name] {
    Attribute
    Konstruktor
    Methoden
}
In jedem Quelltext (name.java) darf/muss es eine öffentliche Klasse mit dem selben Namen geben.

Python:
class [name]:
    Konstruktor
    Methoden
```

### Beispiel

Die Klasse Test enthält ein Attribut (String name)

```JAVA
class Test {
    public String name;
}

// Erzeugen von drei Objekten

class TestTesten {
    public static void main(String[] args) {
        // Erzeugen eines Objektes und speichern der Referenz
        // in der Variablen test1
        Test test1 = new Test();

        // Zugriff auf das Attribut des test1-Objektes
        test1.name = "Mark Müller";

        Test test2 = new Test();
        test2.name = "Alex Meier";

        Test test3 = new Test();

        System.out.println(test1.name);
    }
}
```

* Test = Variablentyp (immer identisch mit der Klasse bzw. Basisklasse)
* test? = Variable (frei wählbar)
* new  = Erzeugt neues Objekt
* Test() = Aufruf des sog. Konstruktors (Name ist ebenfalls gleich dem Klassennamen)

```PYTHON
class Test:
    pass    # Diese Klasse hat noch keinen Inhalt
# ---

test1 = Test()
test1.name = "Mark Müller"

test2 = Test()
test2.name = "Alex Meier"

# Bei Python ist wird der Konstruktor direkt
# (ohne new) aufgerufen
test3 = Test()

print(test1.name)
```

## Methoden

Eine Methode ist eine Funktion, die einem Objekt zugeordnet wird.

Beim Erzeugen eines Objektes mit Hilfe von new (Java) wird immer eine Methode, Konstruktor genannt, aufgerufen. In Java muß der Konstruktor denselben Namen wie die Klasse erhalten, in Python lautet der Name "__init__". Ist kein Konstruktor definiert wird vom Compiler ein Standardkonstruktor hinzugefügt.

this. ist ein Platzhalter für das Objekt.

```JAVA
class Test {
    // name ist ein Attribut der Klasse Test
    public String name;

    // Test() ist der Konstruktor
    // Konstruktoren dürfen keinen Rückgabetyp erhalten
    public Test(String name) {
        this.name = name;
    }

    // grüßen() ist eine Methode (kein static) der Testklasse
    // Methoden können nur auf ein Objekt angewendet werden
    public void grüßen() {
        System.out.println("Hallo " + this.name);
    }
}
```

```PYTHON
class Test:
    # Eine Auflistung der Attribute ist nicht nötig/möglich

    # __init__() ist der Konstruktor
    def __init__(self, name): # self (Variable) enthält Referenz auf das Objekt
        self.name = name

    # grüßen() ist eine Methode der Testklasse
    # Methoden können nur auf ein Objekt angewendet werden
    def grüßen(self):
        print("Hallo {}".format(self.name))
```

## Objekte

Objekte werden aus Klassen (die sozusagen die Blaupause für Objekte darstellen) gebildet.

```JAVA
class TestTesten {
    //...
    Test test = new Test("Hans Wurst");
    test.grüßen();
    test.grüßen();
    test.grüßen();

    Test anderesObjekt;
    anderesObjekt = new Test("Susi Sorglos");
    //...
}
```

```PYTHON
test = Test("Hans Wurst")
test.grüßen()
test.grüßen()
test.grüßen()

anderesObjekt = Test("Susi Sorglos")
```

## Verwendung von Statischen Funktionen
```JAVA
class Person {
    private String name;
    private static int anzahlObjekte = 0;
    Person(String name) {
        this.name = name;
        anzahlObjekte++;
    }
    public static int getAnzahlObjekte() {
        return anzahlObjekte;
    }
}
//...
public class Main {
    public static void main(String[] args) {
        System.out.println(Person.getAnzahlObjekte()); // 0
        Person p = new Person("Hans Wurst");
        System.out.println(Person.getAnzahlObjekte()); // 1
        Person p2 = new Person("Susi Sorglos");
        System.out.println(Person.getAnzahlObjekte()); // 2
    }
}

```

## Vererbung

Vererbung bedeutet dass eine Klasse die Attribute und Methoden einer anderen Klasse erhält. Das ermöglicht es eine Basisklasse zu entwerfen die bereits alle gemeinsamen Informationen speichern kann. Soll das Erben vehindert werden, so muss die Klasse mit `final` deklariert werden.

Bei der Vererbung erhält eine abgeleitete Klasse alle nicht-privaten Attribute und Methoden außer dem Konstruktor.

```JAVA
final class NichtVererbbar {}

class Tier {
    public String name;
    public Tier(String name) {
        this.name = name;
    }
    public void gibLaut() {
        System.out.println(this.name + " macht ein typisches Geräusch.");
    }
}

// Jeder Hund ist auch ein Tier
class Hund extends Tier {
    // Der Konstruktor wird nicht vererbt
    public Hund(String name) {
        this.name = name;
    }
    // Ersetzen (Überladen) der Methode gibLaut()
    @Override
    public void gibLaut() {
        System.out.println(this.name + " bellt.");
    }
}

class TierTesten {
    //...
    Tier tier = new Tier("Eidechse Lukas");
    tier.gibLaut();

    Hund hund1 = new Hund("Bello");
    hund1.gibLaut();

    // Verwenden der Basisklasse als Variablentyp
    Tier hund2 = new Hund("Hasso");
    hund2.gibLaut();
    //...
}
```

```PYTHON
class Tier:
    def __init__(self, name):
        self.name = name

    def gibLaut(self):
        print("{} macht ein typisches Geräusch.".format(self.name))

# Jeder Hund ist auch ein Tier
class Hund(Tier):
    # Der Konstruktor wird nicht vererbt
    def __init__(self, name):
        self.name = name

    # Ersetzen (Überladen) der Methode gibLaut()
    def gibLaut(self):
        print("{} bellt.".format(self.name))

tier = Tier("Eidechse Lukas")
tier.gibLaut()

hund1 = Hund("Bello")
hund1.gibLaut()

hund2 = Hund("Hasso")
hund2.gibLaut()
```

## Abstrakte Klassen und Interfaces

Eine abstrakte Klasse besitzt mindestens eine abstrakte Methode. Es können keine Instanzen von dieser Klasse gebildet werden.

```JAVA
abstract class Eintritt {
    // Attribute

    // Konstruktor
    Eintritt() {}

    // Wir wissen nicht, welche Berechnung durchgeführt werden muss
    abstract double berechnePreis();

    String datenAusgeben() {
        System.out.println("Eintritt für " + this.ort);
    }
}

class KinoEintritt extends Eintritt {
    // Konstruktor
    KinoEintritt() {}

    // Jetzt können wir den Preis berechnen
    double berechnePreis() {
        return ...
    }
}
```

Interfaces unterscheiden sich von Abstrakten Klassen darin, dass es keine implementierten Methoden gibt. Interfaces können keine Attribute, aber Konstanten definieren. Interfaces sind implizit Abstrkt, das Schlüsselwort `abstract` ist jedoch unnötig.

```JAVA
interface Sprache {
    public String getBezeichnung();
}

class Deutsch implements Sprache {
    // Bei Interfaces ist @override nicht nötig
    public String getBezeichnung() {
        return "Deutsch";
    }
}
```

Java kann nur von einer Klasse erben, aber beliebig viele Interfaces implementieren.

## Sichtbarkeit (Java, C++, C#, PHP)

Skriptsprachen wie Javascript oder Python bieten häufig keine Möglichkeit die Sichtbarkeit zu beeinflussen an. PHP ist hier eine Ausnahme.

Gilt für Klassen, Attribute und Methoden

|Bezeichnung|Sprache|Erklärung|
|-|-|-|
|public|C++, Java, PHP, C#|Ausserhalb der Klasse sichtbar|
|private|C++, Java, PHP, C#|Nur innerhalb der Klasse sichtbar|
|protected|C++, Java, PHP, C#|Wie private, wird jedoch vererbt|
|(package)|Java|Innerhalb eines Packages sichtbar; Schlüsselwort wird nicht angegeben|
|internal|C#|Innerhalb einer Assembly sichtbar|
