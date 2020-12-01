package cwiczenia.lekcja12.cwicenie2;

public class cwicenie2 {
//    https://bootcamp.javastart.pl/konto/cwiczenie/1205

    /*Treść zadania

Pliki CSV to uniwersalny sposób przechowywania danych w formie tekstowej. Polega on na tym, że kazdy wiersz w pliku reprezentuje unikalny rekord (obiekt), a informacje na jego temat rozdzielone są separatorem takim jak przecinek lub średnik. Dane zapisane w takim formacie można wykorzystywać w różnych programach, np. MS Excel.

Przykładowy plik CSV może wyglądać w taki sposób:

mleko;Mlekowita;3.2
jogurt truskawkowy;Jogobella;2.19
czekolada;Milka;3.99

Napisz program, w którym utworzysz klasę Product. W klasie testowej utwórz tablicę co najmniej trzech produktów, a następnie zapisz informację o nich w pliku CSV, w którym dane będą w takiej postaci:

nazwa1;producent1;cena1
nazwa2;producent2;cena2
nazwa3;producent3;cena3

Nastęnie stwórz druga klasę, w której stworzysz tablicę typu Product[], wczytasz do niej informacje o produktach, a następnie wyświetlisz zawartość tablicy w konsoli. Rozwiązanie powinno być na tyle uniwersalne, że niezależnie od tego ile jest wierszy w pliku, to program powinien umieć je odczytać.

Program postaraj się napisać w sposób obiektowy, tzn. nie umieszczaj całego kodu programu w metodzie main, tylko spróbuj wydzielić osobne klasy i metody.

Podpowiedź:

W celu wczytania informacji z pliku do tablicy, musisz odczytać plik dwukrotnie. Za pierwszym razem zapisz pętlę, która policzy ile jest wierszy w pliku, a za drugim razem wczytaj informacje i na podstawie każdego wiersza utwórz odpowiedni obiekt.

W celu rozdzielenia wiersza tekstu w formacie CSV na pojedyncze elementy wykorzystać metodę String.split(), a do zamiany napisu na liczbę metodę Double.parseDouble(). Np.:

String csv = "Jan;Kowalski;25";
String[] split = csv.split(";"); //{"Jan", "Kowalski", "25"}

String word = "25";
double number = Double.parseDouble(word);*/
}
