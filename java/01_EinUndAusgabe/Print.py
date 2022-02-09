print("Ausgabe mit Zeilenvorschub")
print("Ausgabe mit Zeilenvorschub")
print("Ausgabe mit Zeilenvorschub")

print("Ausgabe ohne Zeilenvorschub", end="")
print("Ausgabe ohne Zeilenvorschub", end="")
print("Ausgabe ohne Zeilenvorschub", end="")
print()

print("Zeichen: {}, Zeichenkette: {}, Int: {}".format("a", "Xyz", 45054))
print("Int (Hex):{}".format(hex(45054)))
print()

print("Zeichenkette (Groß): '{}'".format("das ist mal ein text".upper()))
print("Zeichenkette (mindestgröße/rechtsbündig): '{:>10}'".format("abcde"))
print("Zeichenkette (mindestgröße/rechtsbündig): '{:>10}'".format("abcdeghijklmnopqrstuvwxyz"))
print("Zeichenkette (linksbündig): '{:<10}'".format("abcde"))

print("Mehrere Parameter: {0} {1} {2}".format("Null", "Eins", "Zwei"))
print("Mehrfache Angabe eines Parameters: {0} {1} {2} {2} {2} {1} {0}".format("Null", "Eins", "Zwei"))
print("Benannte Parameter: {vorname} {nachname}".format("Max", "Mustermann"))
print()

print("Float/Double: {:f}".format(45054.292929))
print("Float/Double: {:7.2f}".format(45054.292929))
