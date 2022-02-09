# Lösung der Aufgabe "Freie Kinositze auf dem Kreuzfahrtschiff"

# 7 Sitzreihen, 30 Plätze pro Reihe
# Sitzreihe 1: Sitznummern 101 bis 130
# Sitzreihe 2: Sitznummern 201 bis 230

def freie_sitze(anzahl_sitze):
    for reihe in range(7):
        # Anzahl Sitze nebeneinander
        anzahl = 0
        for sitz in range(30):
            if kino[reihe][sitz]:
                # Einen freien Sitz gefunden
                anzahl = anzahl + 1
                if anzahl == anzahl_sitze:
                    # Die benötigte Anzahl wurde erreicht
                    return (reihe + 1) * 100 + anzahl + 1
            else:
                # Kein freier Sitzplatz: zurück zum Start
                anzahl = 0
    # Nix gefunden
    return 0
