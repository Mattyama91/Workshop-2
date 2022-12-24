# Workshop-2
Obiektowa warstwa dostępu do danych.

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki.

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`.

Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".

Zwróć uwagę, żeby użyć adresu własnego forka, powinien wyglądać zgodnie ze schematem:
`https://github.com/twoj-login/adres_repozytorium`


3. Zaimportuj projekt jako projekt `Maven`, wg poniższych wskazówek:

	* W `IntelliJ` wybieramy: `File –> New –> Project from Existing Sources...`
	* Wskazujemy lokalizację katalogu ze sklonowanym projektem i zatwierdzamy.
	* Następnie w nowym oknie wybieramy: `Import project from external model` i wskazujemy `Maven`
	* Wybieramy opcję: ` Finish`, (w `IntelliJ` przed 2020: `Next –> Next –> Next –> Finish`);

4. W pliku pom.xml dodaj zaleźności do
	* sterownika bazy danych:
	* JBcrypt:
	
5. Podstawą do naszych dalszych działań jest baza danych. Przygotuj bazę danych o nazwie workshop2 według zapytania:
	`CREATE DATABASE workshop2 CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;`

6. Kolejnym krokiem jest utworzenie tabeli users według poniższego zapytani:
	`CREATE TABLE users`
	`(`
    		`id INT(11) AUTO_INCREMENT,`
    		`email VARCHAR(255) UNICODE DEFAULT NULL,`
    		`username VARCHAR(255) DEFAULT NULL,`
    		`password VARCHAR(60) DEFAULT NULL,`
    		`PRIMARY KEY (id)`
	`);`
