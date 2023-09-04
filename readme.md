`4. September 2023` - `neueFische - Java Development Bootcamp`

# BigDecimal
## Theoretische Fragen
1. Recherchiert (oder findet durch ausprobieren) eine vermeintlich einfache Rechnung, bei der double das falsche Ergebnis liefert (im Gegensatz zu BigDecimal). Nimm andere Beispiele als die im Vortrag/Handout genannten Zahlen.
2. Man könnte meinen ein klitzekleiner Rundungsfehler (den double erzeugen würde) ist nicht weiter zu beachten. Nennt eine Situation, in der Ihr Euch vorstellen könnt, dass auch ein solcher minimaler Fehler ins Gewicht fallen könnte.
3. Ihr arbeitet für ein Pharmaunternehmen und sollt eine Methode implementieren, die berechnet wie viele Versandkartons benötigt werden um eine bestimmte Anzahl von Tablettenschachteln zu versenden. Das Ergebnis soll die Anzahl der benötigten Kartons darstellen. Welchen RoundingMode würdet Ihr verwenden (java.math.RoundingMode)? Beispielcode: https://github.com/bartfastiel/bigdecimal-roundingmode/blob/main/src/main/java/org/example/Main.java

## Aufgaben
1. Erstellt eine Record 'Client' mit den Eigenschaften Vorname, Nachname und Kundennummer (wähle geeignete englische Feldnamen).
2. Erstellt eine Klasse 'Account' (kein Record, soll vorerst veränderlich sein) mit den Eigenschaften Kontonummer (String), Kontostand (BigDecimal) und dem zugehörigen Kunden.
### Nun implementieren wir convenience-Methoden, um den Kontostand zu ermitteln und zu verändern.
3. Implementiert eine Methode, um Geld auf das Konto einzuzahlen.
4. Implementiert eine Methode, um Geld vom Konto abzuheben.
### Nun implementieren wir eine Klasse, die eine Liste von Kunden und deren Konten verwaltet.
5. Erstellt eine Klasse 'BankService', die eine Menge von Konten verwaltet.
6. Implementiert eine Methode im BankService, um ein Konto zu eröffnen. Man soll dafür nur einen Kunden als Argument übergeben müssen. Es soll die neue Kontonummer zurückgeben.
7. Implementiert eine Methode im BankService, von einer Kontonummer (als String) einen bestimmten Betrag (als BigDecimal) auf eine andere Kontonummer (als String) zu überweisen.
### Was passiert, wenn 3 Cent auf zwei Personen aufgeteilt werden?
8. Baut Eure Records und Klassen so um, dass ein Konto mehreren Kontoinhaberinnen gehören kann (zwei oder mehreren Kontoinhaberinnen).
9. Schreibe im Service eine Methode public List<String> split(String accountNumber), die ein Konto zu gleichen Teilen aufteilt. Aus einem Gemeinschaftskonto soll dabei pro Kontoinhaber*in ein Einzelkonto entstehen. Es soll die entstandenen neuen Kontonummern zurückgeben. Jedes Konto soll nach der Aufteilung gleich viel Geld abbekommen (+- 1 Cent). Achte darauf, dass uns als Bank dabei weder Cent-Gewinne noch Cent-Verluste entstehen.
#### PS: wie üblich gibt es auch bei unserer Bank keine halben Cent ;)
#### Tipp: auch hier eignet sich Test Driven Development sehr gut, um die Aufgabe zu lösen! (gilt auch für die folgenden Aufgaben)
### Eine Bank ohne Zinsen? Das geht ja gar nicht!
10. Erweitert den 'BankService' um eine Methode, die Zinsen für alle Kundenkonten basierend auf einem Zinssatz berechnet und gutschreibt. (Zinsen = Kontostand * (Zinssatz / 100).
### Einen Kontoauszug bitte!
11. Schreibt Eure Klassen so um, dass es nicht mehr einen fixen Kontostand gibt, sondern eine Liste von Transaktionen. Jede Transaktion hat einen Betrag, einen Saldo (neuer Kontostand nach der Veränderung), eine Beschreibung (optional) und ein Datum. Die Transaktionen sollen als Record implementiert werden. Um den aktuellen Kontostand zu ermitteln soll der BankService das Saldo der letzten Transaktion zurückgeben.
### Unterjährige Berechnung von Zinsen
12. Bei jeder Abheben- oder Einzahlen-Aktion sollen die Zinsen, die seit der letzten Transaktion angefallen sind berechnet werden. Der im BankService hinterlegte Zinssatz soll dabei den jährlichen Zins darstellen. Achtet bei der Berechnung auf den Zinseszinseffekt (bei 4% Zins sind nach einem halben Jahr noch nicht ganz 2% angefallen). Erstellt für Zins-Gutschriften (oder Zins-Belastungen) jeweils pro Transaktion eine zweite Transaktion.


