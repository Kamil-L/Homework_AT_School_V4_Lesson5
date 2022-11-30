Program o nazwie MovieLibrary przechowujacy liste filmow.

Każdy film ma: tytuł, rok wydania, reżysera, gatunek oraz listę aktorów

Reżyser oraz aktorzy maja oddzielnie imię i nazwisko.

Zastosowano programowanie obiektowe - klasy np. MovieLibrary, Movie, Director, Actor wraz z potrzebnymi polami klasy i metodami.

Dane zaimportowanee z pliku JSON o nazwie movies.json (lista filmow)

Do deserializacji danych uzyto biblioteki ‘jackson’

Stworzono menu w programie, które będzie wyświetlane użytkownikowi w konsoli, wraz z obsługą wybranych przez niego opcji:

               1. Podaj dwie daty aby wyświetlić nazwy filmów wydanych pomiędzy tymi datami

               2. Wyświetl wszystkie informacje o losowym filmie

               3. Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich zagrał

Bez obsługi wyjątków (typu InputMismatchException) przy wybieraniu menu. Zakładamy, że użytkownik podaje dane nie popełniając błędów.

 
Wyświetlenie wszystkich informacji o filmie jako wypisanie ich np. w takim formacie (nadpisanie metody toString() w klasach typu Movie, Actor itd) :

title: The Shawshank Redemption

director: Frank Darabont

genre: drama

date: 1994

actors: Tim Robbins, Morgan Freeman, Bob Gunton

 
