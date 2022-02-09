// Lösung der Aufgabe "Freie nebeneinander liegende Kinositze auf dem Kreuzfahrtschiff"
//
// 7 Sitzreihen, 30 Plätze pro Reihe
// Sitzreihe 1: Sitznummern 101 bis 130
// Sitzreihe 2: Sitznummern 201 bis 230

public int freieSitze(int anzahlSitze) {
    for (int reihe = 0; reihe < 7; reihe++) {
        // Anzahl Sitze nebeneinander
        int anzahl = 0;
        for (int sitz = 0; sitz < 30; sitz++) {
            if (kino[reihe][sitz]) {
                // Einen freien Sitz gefunden
                anzahl++;
                if (anzahl == anzahlSitze) {
                    // Die benötigte Anzahl wurde erreicht
                    return (reihe + 1) * 100 + anzahl + 1;
                }
            } else {
                // Kein freier Sitzplatz: zurück zum Start
                anzahl = 0;
            }
        }
    }
    // Nix gefunden
    return 0;
}
