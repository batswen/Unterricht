# Netzwerkgrundlagen

### Das OSI-Schichtenmodell
#### Schicht 1
Bitübertragungsschicht / Physical layer<br/>
Hardware, z. B. Token ring, 1000 BASE-T
#### Schicht 2
Sicherungsschicht / Data link layer<br/>
Ethernet, WLAN, MAC, Token ring
#### Schicht 3
Vermittlungsschicht / Network layer<br/>
IP, IPsec, ICMP, IGMP
#### Schicht 4
Transportschicht / Transport layer<br/>
TCP, UDP
#### Schicht 5
Sitzungsschicht / Session layer<br/>
#### Schicht 6
Darstellungsschicht / Presentation layer<br/>
#### Schicht 7
Anwendungsschicht / Application layer<br/>
##### Merksätze
(Englisch, 1 bis 7) Please Do Not Throw Salami Pizza Away<br/>
(Deutsch, 7 bis 1) Alle deutschen Studenten trinken verschiedene Sorten Bier
### Bezeichnungen
Name (Langform) [Port]<br/>
MAC (Media-Access-Control)<br/>
IP (Internet Protocol)<br/>
TCP (Transport Control Protocol)<br/>
UDP (User Datagram Protocol)<br/>
DNS (Domain Name Service) [53]<br/>
LDAP (Lightweight Directory Access Protocol) [TCP/UDP]<br/>
DHCP (Dynamic Host Configuration Protocol) [67 Server/Relay agent, 68 Client]<br/>
HTTP (HyperText Transfer Protocol) [80]<br/>
HTTPS (HyperText Transfer Protocol Secure) [443]
### IP-Adressen (IPv4)
IPv4-Adressen bestehen aus vier vorzeichenlosen Bytes, Oktett genannt, getrennt durch je einen Punkt.
```
Beispiel: 192.168.0.1
Beispiel: 200.200.200.200
```
#### Subnetzmaske
Die Subnetzmaske unterteilt die IP-Adresse in Netzwerkteil und Hostteil. Der Netzwerkteil wird durch Einsen (links) angezeigt, der Hostteil (rechts) durch Nullen. Nach der ersten Null kann keine Eins mehr vorkommen.
```
Beispiel: 255.255.255.0 (Binär: 11111111.11111111.11111111.00000000)
Beispiel: 255.255.192.0 (Binär: 11111111.11111111.11000000.00000000)

192.168.0.1     = 11000000.10101000.00000000.00000001
255.255.255.0   = 11111111.11111111.11111111.00000000
Netzwerkteil    = 11000000.10101000.00000000.xxxxxxxx (= 192.168.0.x)
Hostteil        = xxxxxxxx.xxxxxxxx.xxxxxxxx.00000001 (= x.x.x.1)

Wie man sieht sind die ersten drei Byte der IP-Adresse der Netzwerkteil und das letzte Byte ist der Hostteil
```
Als Kurzform der Subnetzmaske hat sich der Suffix etabliert, hierbei wird lediglich die Anzahl der Einsen angegeben. Der Suffix wird an die IP-Adresse angehängt.
```
Beispiel: 192.168.0.1/24 (für 255.255.255.0)
Beispiel: 192.168.0.1/20 (für 255.255.240.0)
Beispiel: 192.168.0.1/16 (für 255.255.0.0)
```
#### Gateway
Ein Gateway ist die Verbindung zwischen zwei Netzwerken.
#### Netzklassen
Der verfügbare 32-Bit-Adressbereich ist in fünf sog. Netzklassen unterteilt. Die Klassen A, B, C sind zur freien Verwendung gedacht, D ist für Multicasts gedacht und E ist für zukünftige Erweiterung reserviert.
```
Netzklasse Präfix Bereich                      Netzmaske
 A          0...     0.0.0.0 - 127.255.255.255  255.0.0.0
 B          10..   128.0.0.0 - 191.255.255.255  255.255.0.0
 C          110.   192.0.0.0 - 223.255.255.255  255.255.255.0
 D          1110   224.0.0.0 - 239.255.255.255
 E          1111   240.0.0.0 - 255.255.255.255

Hier enthalten sind drei private Netzwerke:
 A 10.0.0.0/8       1 privates 8-Bit-Netzwerk
 B 172.16.0.0/12   16 private 16-Bit-Netzwerke
 C 192.168.0.0/16 256 private 24-Bit-Netzwerke
sowie das Loopback-Interface, auch "localhost" genannt:
 A 127.0.0.0/8
```
#### Subnetze
Über die Subnetzmaske kann ein Netzwerk in mehrere, von einander unabhängige Netzwerke unterteilt werden.

#### APIPA = Automatic Private IP Addressing
Wenn ein Client auf DHCP konfiguriert ist, aber der DHCP-Server nicht erreicht werden kann, wählt sich der Client eine IP-Adresse aus dem Netzwerk 169.254.0.0/16.

### IP-Adressen (IPv6)
IPv6-Adressen haben eine Länge von 128 Bit. Sie sind in 8 Blöcke zu je sechzehn Bit unterteilt. Die einzelnen Blöcke (Hextette) werden durch ein Doppelpunkt getrennt. Anstatt einer Subnetzmaske wird hier immer die Kurzform (bei IPv4: Suffix, bei IPv6: Präfix) genutzt.

```
2000:0AF2:0001:00A0:0E80:0000:1000:00EF/64
```

Führende Nullen können entfallen. Eine Folge von Nullen (0000) kann durch zwei Doppelpunkte ersetzt werden.

```
Die IPv6-Adresse
2000:0000:0000:0000:0002:0000:0000:0000
kann wie folgt dargestellt werden:
entweder: 2000::2:0:0:0
oder:     2000:0:0:0:2::

   2000:0AF2:0001:00A0:0E80:0000:1000:00EF
-> 2000:AF2:1:A0:E80:0:1000:EF
```
