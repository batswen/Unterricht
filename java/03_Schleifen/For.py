i = 0
while i < 10:
    print("In der While-Schleife, i: {}".format(i))
    i += 1
print("Nach der While-Schleife, i: {}".format(i))

for j in range(10):
    print("In der For-Schleife, j: {}".format(j))
print("Nach der For-Schleife, j: {}".format(j))

# Iterieren über ein Array
zahlen = [15, 20, 0, -5, 100]
for zahl in zahlen:
    print("Inhalt: {}".format(zahl))

# Iterieren mit Index
zahlen = [15, 20, 0, -5, 100]
for index, zahl in enumerate(zahlen):
    print("Index: {}, Inhalt: {}".format(index, zahl))
