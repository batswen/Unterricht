# Rechenaufgaben

## Berechnen Sie die Netzadresse, die Hostadresse, alle verwendbaren IP-Adressen, sowie die Subnetzmaske

* 153.123.221.235/22
* 10.0.129.224/20
* 172.20.240.0/20
* 192.168.255.0/24
* 79.121.97.0/26
* 2.4.6.8/30
* 10.12.14.16/28
* 192.168.0.1/24
* 192.168.192.1/27
* 100.100.100.100, SN: 255.255.240.0
* 200.150.100.50, SN: 255.255.255.0
* 200.150.100.50/28
* 160.128.128.128, SN: 255.255.128.0

## Aufgaben

### Aufgabe 1
Sie müssen ein Firmennetzwerk aufbauen. Es gibt 5 verschiede Abteilungen mit jeweils ca. 25 Computern, Druckern und Routern. Verwenden Sie die private Klasse-C-IP 192.168.0.0.

Erstellen Sie eine Tabelle mit allen Netzwerkadressen, Broadcastadressen sowie der ersten und letzten Hostadresse. Wie viele Hosts sind pro Netzwerk möglich, wie lautet die Subnetzmaske bzw. der Suffix?

### Aufgabe 2
Das Netzwerk 192.168.200.5 soll in mehrere Subnetze mit 40 Hosts unterteilt werden. Erstellen Sie eine Tabelle mit allen Netzwerkadressen, Broadcastadressen und  der ersten und letzten Hostadresse. Wie viele Hosts sind pro Netzwerk möglich, wie lautet die Subnetzmaske bzw. der Suffix?

### Aufgabe 3
Ein Kollege hat die folgenden Clients in einem anderen Netzwerk konfiguriert. Hierbei sind einige Fehler aufgetreten. Finden und korrigieren Sie die Fehler.

```
                Client 1        Client 2        Client 3        Client 4        Gateway
IP-Adresse      192.168.0.1     192.168.0.127   192.168.0.255   192.168.0.2     192.168.0.254
Subnetzmaske    255.255.254.0   255.255.255.0   255.255.255.0   255.255.255.0   255.255.255.0
Gateway         192.168.0.254   192.168.0.255   192.168.0.254   192.168.0.255   -
```
