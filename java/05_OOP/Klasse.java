// In jeder Datei darf sich nur eine öffentliche klasse (public class) befinden
// Diese muss denb selben Namen tragen wie die Datei, hier: "Klasse.java/public class Klasse"
public class Klasse {}


// Es können weitere nicht öffentliche Klassen definiert werden
class Person {
    public String name;
}

class TestPerson {
    // erstellen einer Klasseninstanz/Objekt
    Person person = new Person();
    // Erklärung:
    // Person -> Datentyp der Variablen
    // person -> Variable; enthält das Objekt (vereinfacht gesprochen)
    // new    -> Erzeugt ein neues Objekt
    // Person() -> Aufruf des Kostruktors (wird automatisch erstellt, wenn nicht definiert)

    // Schreibzugriff auf das Attribut "name"
    person.name = "Max Mustermann";
    // Lesezugriff auf das Attribut "name"
    System.out.println(person.name);
}

// -----

class Person {
    private String name;
    public Person(String name) {
        // this ist ein Platzhalter für das aktuelle Objekt
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

class TestPerson {
    // erstellen einer Klasseninstanz/Objekt
    Person person = new Person("Max Mustermann");
    // Erklärung:
    // Person -> Datentyp der Variablen
    // person -> Variable; enthält das Objekt (vereinfacht gesprochen)
    // new    -> Erzeugt ein neues Objekt
    // Person() -> Aufruf des Kostruktors, angabe des Namens

    // Schreibzugriff auf das Attribut "name"
    // wird nicht aufgeführt/kompiliert, weil das Attribut "name" privat ist
    person.name = "Max Mustermann";
    // Lesezugriff auf das Attribut "name"
    System.out.println(person.name);
}
