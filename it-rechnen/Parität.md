# Paritätsberechnung

## Gerade Parität
Bei der geraden Parität muss an jeder Stelle eine gerade Anzahl an Eins-Bits vorhanden sein, d. h. keine oder zwei Einsen.

|Eingabe|7|6|5|4|3|2|1|0|
|-|-|-|-|-|-|-|-|-|
|1.|1|1|0|0|1|0|1|0|
|2.|0|1|0|1|0|1|0|1|
|Parität|1|0|0|1|1|1|1|1|

## Ungerade Parität
Bei der ungeraden Parität muss an jeder Stelle eine ungerade Anzahl an Eins-Bits vorhanden sein, also eine oder drei Einsen.

|Eingabe|7|6|5|4|3|2|1|0|
|-|-|-|-|-|-|-|-|-|
|1.|1|1|0|0|1|0|1|0|
|2.|0|1|0|1|0|1|0|1|
|Parität|0|1|1|0|0|0|0|0|

## RAID 5
Für einen RAID-5-Verbund wird eine weitere Festplatte benötigt. Auf dieser werden die Paritätsinformationen des Verbundes abgelegt. Dadurch kann jede Festplatte ausfallen (inkl. der Paritätsplatte) ohne dass es zu Datenverlust kommt.

Die Kapazität berechnet sich durch

**KapazitätDerFestplatten * (AnzahlDerFestplatten - 1)**

Bei drei Festplatten mit jeweils 500 GB Kapazität also:

**500 GB * (3 - 1) = 1000 GB**

#### Beispiel
Bei einem RAID-5-Verbund mit drei Festplatten fällt die zweite Festplatte aus

|Festplatte|Aufgabe|7|6|5|4|3|2|1|0|
|-|-|-|-|-|-|-|-|-|-|
|1|Daten|1|1|0|0|1|1|1|1|
|2|Daten|0|1|0|1|0|1|0|1|
|3|Parität|1|0|0|1|1|0|1|0|

###### Ausfall von Festplatte 2

|Festplatte|Aufgabe|7|6|5|4|3|2|1|0|
|-|-|-|-|-|-|-|-|-|-|
|1|Daten|1|1|0|0|1|1|1|1|
|2 (defekt)|Daten|?|?|?|?|?|?|?|?|
|3|Parität|1|0|0|1|1|0|1|0|

###### Ersetzen der zweiten Festplatte und wiederherstellen der Informationen

|Festplatte|Aufgabe|7|6|5|4|3|2|1|0|
|-|-|-|-|-|-|-|-|-|-|
|1|Daten|1|1|0|0|1|1|1|1|
|3|Parität|1|0|0|1|1|0|1|0|
|2 (neu)|Daten|0|1|0|1|0|1|0|1|
