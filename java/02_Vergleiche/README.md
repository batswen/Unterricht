# Vergleiche
In den meisten Programmiersprachen gibt es den Datentyp Wahrheitswert: "Boolean"|JAVA) bzw "Bool"|C++). Dieser kann nur die Werte "True" oder "False" annehmen.

## Bool'sche Ausdrücke
Einen Wahrheitswert erhält man durch Vergleiche. Es gibt die folgenden sechs verschiedenen Möglichkeiten Werte zu vergleichen:

|Symbol|Bezeichnung|
|-|-|
|==|Gleich|
|!=|Ungleich|
|&gt;|Größer als|
|<|Kleiner als|
|&gt;=|Größer oder Gleich|
|<=|Kleiner oder Gleich|

Jeder dieser Vergleiche ergibt entweder Wahr (true) oder Falsch (false).

### Beispiele

|Vergleich|Ergebnis|
|-|-|
|1 < 3|true|
|'a' < 'z'|true|
|3 == 5|false|
|3 != 5|true|
|3 > 5|false|
|8 > 5|true|

Achtung: Bei Java ist es nicht möglich Zeichenketten zu vergleichen.
Hierfür muss die equals()-Methode verwendet werden.

```JAVA
// Java
"abc".equals("abc") // true
"abc".equals("123") // false
```

## Verknüpfungen mit UND und ODER (Kurzschluss-Operatoren)

Die Operatoren && (Python: and) und || (Python: or) werden benutzt um mehrere Vergleiche durchzuführen. Dabei handelt es sich um sog. Kurzschluss-Operatoren, die evtl. nicht alle Operationen ausführen. Der Fall false && true führt nur den ersten Vergleich aus, danach steht bereits fest, dass das Ergebnis false sein muss. Der zweite Vergleich (z. B. ein Funktionsaufruf) wird übersprungen.

Java

|Verknüpfung|Ergebnis|
|-|-|
|true && true|true|
|true && false|false|
|false && true*|false|
|false && false*|false|


Python

|Verknüpfung|Ergebnis|
|-|-|
|True and True|True|
|True and False|False|
|False and True*|False|
|False and False*|False|


Java

|Verknüpfung|Ergebnis|
|-|-|
|true \|\| true*|true|
|true \|\| false*|true|
|false \|\| true|true|
|false \|\| false|false|


Python

|Verknüpfung|Ergebnis|
|-|-|
|True or True|True|
|True or False|False|
|False or True*|False|
|False or False*|False|

Bei den mit einem Asterisk markierten Verknüpfungen wird die zweite Prüfung
nicht ausgeführt!

### Beispiel
```JAVA
// Java
if (0 < 1 && 1 < 2) { ... } // beide Prüfungen werden ausgeführt
if (0 > 1 && 1 > 2) { ... } // 1 > 2 wird nicht ausgeführt
```

```PYTHON
# Python
if 0 < 1 and 1 < 1: # beide Prüfungen werden ausgeführt
if 0 > 1 and 1 > 2: # 1 > 2 wird nicht ausgeführt
```

## Nicht
Der Nicht-Operator kehrt den Wahrheitswert um, d. h. !true => false und !false => true.

### Beispiel
```JAVA
// Java
if (!false) { ... } // Die Anweisungen werden ausgeführt
if (!true) { ... }  // Nur ein ELSE-Zweig wird ausgeführt
```

```PYTHON
# Python
if not False: # Die Anweisungen werden ausgeführt
if not True:  # Nur ein ELSE-Zweig wird ausgeführt
```
