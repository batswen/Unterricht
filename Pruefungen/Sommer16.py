# Lösung der Aufgabe "Rechnungen für Vereinsmitglieder der Sportsfit AG"

# Für eine bessere Lösung/optimierte Version wäre ich dankbar

def erstelle_rechnung():
    letzte_kundenid = ""

    datensatz = hole_journalsatz()
    kunden_id = lese_kundenid(datensatz)
    leistungs_id = lese_leistungid(datensatz)

    while datensatz != "":
        letzte_kundenid = kunden_id
        position = 1
        rechnungssumme = 0

        schreibe_kundenid(kunden_id)
        schreibe_kopfzeile()

        while datensatz != "" and kunden_id == letzte_kundenid:
            letzte_leistungsid = leistungs_id

            bezeichnung = lese_bezeichnung(datensatz)

            gesamtpreis = 0

            while datensatz != "" and kunden_id == letzte_kundenid and leistungs_id == letzte_leistungsid:
                anzahl = lese_anzahl(datensatz)
                einzelpreis = lese_einzelpreis(datensatz)
                gesamtpreis += einzelpreis * anzahl

                datensatz = hole_journalsatz()
                kunden_id = lese_kundenid(datensatz)
                leistungs_id = lese_leistungid(datensatz)

            schreibe_positionszeile(position, letzte_leistungsid, bezeichnung, anzahl, einzelpreis, gesamtpreis)
            rechnungssumme += gesamtpreis
            position += 1
        schreibe_rechnungssumme(rechnungssumme)
