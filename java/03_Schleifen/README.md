# Schleifen (engl. Loop)

Die Befehle in einer Schleife werden mehrfach ausgeführt.

## WHILE

Die While-Schleife ist eine der kopfgesteuerten Schleifen, hier wird vor Schleifenbeginn die Bedingung geprüft. Die While-Schleife wird unter Umständen nicht ausgeführt.

```
// Java
initialisierung
while (bedingung) {
    ...
    iteration
}

# Python
initialisierung
while bedingung:
    ...
    iteration
```

## DO WHILE

Die Bedingung wird erst nach Abarbeiten des Schleifenrumpfes geprüft, dadurch wird sie mindestens einmal ausgeführt. Diese Schleife gibt es nicht in Python.

```
// Java
initialisierung
do {
    ...
    iteration
} while(bedingung)
```

## FOR

Kurzschreibweise der While-Schleife

```
// Java
for (initialisierung; bedingung; iteration) {
    ...
}

for (int i = 0; i < 10; i++) {
    ...
}

# Python
for var in iterierbar:
    ...

for i in range(10): # Erzeugt Bereich von 0 bis 9
    ...
```

## FOREACH

Zur Iteration über Arrays und Zeichenketten kann die Foreach-Schleife verwendet werden. In die "Singular-Variable" werden nacheinander alle Einträge aus dem Array/der Zeichenkette übergeben.

In Python kann auch hierfür die normale For-Schleife verwendet werden.

```
for (singular: plural) {

}
```

### Vergleich von WHILE und FOR
```JAVA
// ForSchleife.java
public class ForSchleife {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("!");
        }
    }
}

// WhileSchleife.java
public class WhileSchleife {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("!");
            i++;
        }
    }
}
```

Diese beiden Programme erzeugen den exakt gleichen Code.

```
$ javap -c ForSchleife.class

Compiled from "ForSchleife.java"
public class ForSchleife {
  public ForSchleife();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: iconst_0
       1: istore_1
       2: iload_1
       3: bipush        10
       5: if_icmpge     22
       8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      11: ldc           #3                  // String !
      13: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      16: iinc          1, 1
      19: goto          2
      22: return
}
```

```
$ javap -c WhileSchleife.class

Compiled from "WhileSchleife.java"
public class WhileSchleife {
  public WhileSchleife();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: iconst_0
       1: istore_1
       2: iload_1
       3: bipush        10
       5: if_icmpge     22
       8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      11: ldc           #3                  // String !
      13: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      16: iinc          1, 1
      19: goto          2
      22: return
}
```
