# Datentypen

## Char

Ein einzelnes Zeichen in einfachen Hochkommas (Apostroph). Als Zeichenkodierung wird UTF-16 verwendet, jedes zeichen benötigt zwei Byte Speicerplatz.
```
'a'
'1'
' '
```

## String (Zeichenkette)

Beliebige Anzahl an Zeichen in doppelten Anführungszeichen.
Der String-Datentyp wird durch die String-Klasse erzeugt. Das hat einige Vor- und Nachteile, wie z. B. ist es nicht möglich zwei Zeichenketten durch den ==-Operator zu vergleichen.
```
"Zeichenkette in Anführungszeichen"
"Noch ein String"
```

## Int / Long / Short / Byte

Integer (immer mit Vorzeichen; Integerzahlen sind immer dann negativ, wenn das höchste Bit Eins ist). An Long-Zahlen im Quelltext, die größer als 32 Bit sind, muss ein 'l' angehängt werden.
```JAVA
long  //(64 Bit, Bereich: -9223372036854775808 bis 9223372036854775807)
int   //(32 Bit, Bereich: -2147483648 bis 2147483647)
short //(16 Bit, Bereich: -32768 bis 32767)
byte  //( 8 Bit, Bereich: -128 bis 127)
```
Die Interger-Klasse bietet Funktionen zur Verarbeitung von vorzeichenlosen Zahlen an.

## Boolean

Wahr oder Falsch

## Float / Double

Fließkommazahlen im Quelltext werden immer als double betrachtet. Will man ein float schrieben, so muss an die letzte Ziffer ein 'f' angehägt werden (siehe unten).
```JAVA
float  //(32 Bit, Sechs Nachkommastellen)
double //(64 Bit, Fünfzehn Nachkommastellen)
```

## Arrays

Ein Array kann mehrere Daten speichern.

```JAVA
// Erstellen eines leeren Arrays
int[] zahlen = new int[10]; // Platz für zehn Zahlen
zahlen[0] = 0; // Erster Eintrag
zahlen[9] = 1; // Letzter Eintrag

// Erstellen eines Arrays aus bekannten Daten
int[] messwerte = {5, 0, -5, 12, 11, 0, 18};
```

```PYTHON
# Erstellen eines leeren Arrays
zahlen = []

# Hionzufügen von Werten
zahlen.append(15)
zahlen.append(0)
zahlen.append(-1)

zahlen[0] = 0 # Erster Eintrag
zahlen[-1] = 1 # Letzter Eintrag


# Erstellen eines Arrays mit Vorgabewerten
andere_zahlen = [0] * 10 # andere_zahlen = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

# Erstellen eines Arrays aus bekannten Daten
messwerte = [5, 0, -5, 12, 11, 0, 18]
```

## Casting (Wandeln eines Datentyps in einen Anderen)

Kleinere Datentypen können problemlos in größere Datentypen um gewandelt werden, als z. B. short nach int. Short und char können verlustfrei gecastet werden.

```JAVA
int artikelnummer = 12_333_61230_8;     // = 12333612308
int strichcode = 4051_8169;             // = 40518169
int vieleUnterstriche = 1__________0;   // = 10
int hex = 0xF0A08020;                   // Hexzahl
int hex2 = 0x80_90_A0_B0;               // = 0x8090A0B0
int bin = 0b01010101_10101010;          // Binär
int a = 1000000;
short b = 1000;
byte by = 100;
long l = 5_000_000_000L;                // "L" oder "l" anhängen!
float f = 3.14F;                        // "F" oder "f" anhängen!
double d = 3.14159;

// int = short
a = b;          // ok, weil int > short

// short = int
a = 1000000;
b = a;          // Fehler, weil short < int. Verlust von 16 Bits.

// short = (short)int
b = (short)a;   // Kein Fehler mehr, aber b enthält 16960.

// byte = (byte)int
by = (byte)a;   // by enthält 64.

// byte = (byte)signed byte
by = (byte)200; // Kein Fehler, by enthält -56.
/*
1.000.000 = 00000000 00001111 01000010 01000000 (32 Bit = int)
   16.960 =                   01000010 01000000 (16 Bit = short)
-56 o.200 =                            11001000 ( 8 Bit = byte)
       64 =                            01000000 ( 8 Bit = byte)
*/

String s = "Abc";
char c;

b = (short)c; // verlustfrei
c = (char)b; // verlustfrei

c = s.charAt(0); // Wandelt das 0. Zeichen in ein char um

System.out.println(1.11111111111111111f);   // Ausgabe: 1.1111112
System.out.println(1.11111111111111111);    // Ausgabe: 1.1111111111111112
```

## Weitere Operatoren
Für die normalen Rechenoperatoren gibt es Kurzschreibweisen
```JAVA
a += b; // bzw -= *= /= %= <<= >>=
// ist kurz für
a = a + b; // bzw - * / ...
```

### Beispiel

```JAVA
int i = 0;

// Erhöhen der Variablen i um Eins
i = i + 1;  // i enthält 1
i += 1;     // i enthält 2, Kurzschreibweise der oberen Rechnung
```

## Prä- und Postinkrement- bzw. Dekrement-Operatoren.
Diese Operatoren erhöhen bzw vermindern eine Variable um Eins.
```JAVA
int i = 0, ergebnis = 0;

// Erhöhen der Variablen i um Eins
i++;    // Postinkrement, i ist jetzt 1
++i;    // Präimkrement, i ist jetzt 2

// Verwendung bei gleichzeitiger Nutzung der Variablen
ergebnis = i++; // ergebnis erhält den Wert von i (2), danach wird i um Eins erhöht (i ist 3)
ergebnis = ++i; // zuerst wird i um Eins erhöht, danach erfolgt die Zuweisung

i = 5;
System.out.println("i = " + i);      // Ausgabe: i = 5

System.out.println("i++ " + i++);    // Ausgabe: i = 5

System.out.println("i = " + i);      // Ausgabe: i = 6

System.out.println("++i " + ++i);    // Ausgabe: i = 7

System.out.println("i = " + i);      // Ausgabe: i = 7

// Der Dekrement Operator -- subtrahiert Eins.
i--;    // i ist 6
```
