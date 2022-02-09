# Prüfzifferberechnung

def prüfe_id(id):
    id = str(id)
    summe = 0
    for i in range(len(id) - 1):
        ziffer = int(id[i])

        # alle geraden Stellen
        if i % 2 == 0:

            # mit Zwei multiplizieren
            ziffer *= 2

            # evtl. Quersumme bilden
            if ziffer >= 10:
                ziffer -= 9

        # alle Ziffern aufaddieren
        summe += ziffer

    # auf nächst größere durch 10 teilbare Zahl aufrunden
    sum10 = summe
    if summe % 10 != 0:
        sum10 = summe + 10 - summe % 10

    # Prüfziffer berechnen
    summe = sum10 - summe

    # True oder False zurückliefern
    return summe == int(id[len(id) - 1])

print(prüfe_id(6258431979))
