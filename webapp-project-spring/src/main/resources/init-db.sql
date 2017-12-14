CREATE DATABASE IF NOT EXISTS petclinic;

USE petclinic;

DROP TABLE IF EXISTS Vaccin;
DROP TABLE IF EXISTS Animal;
DROP TABLE IF EXISTS Proprietaire;

CREATE TABLE Proprietaire(
id INT NOT NULL,
birthDate DATE,
email VARCHAR(40) NOT NULL,
firstName VARCHAR(40) NOT NULL,
lastName VARCHAR(40) NOT NULL,
password VARCHAR(40) NOT NULL,
role VARCHAR(40) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE Animal(
id INT NOT NULL,
race VARCHAR(60) NOT NULL,
nom VARCHAR(120) NOT NULL,
dateDeNaissance DATE,
proprietaire_id INT NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE Vaccin(
id INT NOT NULL,
inoculation VARCHAR(60) NOT NULL,
rappel DATE,
type VARCHAR(120) NOT NULL,
animal_id INT NOT NULL,
emailSent BOOLEAN,
PRIMARY KEY (id)
);


INSERT INTO Proprietaire (id, birthDate, email, firstName, lastName, password, role) VALUES (1, '1980-02-15', 'john.doe@test.fr', 'John', 'Doe', 'password', 'ROLE_USER');
INSERT INTO Proprietaire (id, birthDate, email, firstName, lastName, password, role) VALUES (2, '1996-04-22', 'treeptik.petclinic@gmail.com', 'Petclinic', 'Treeptik', 'password', 'ROLE_USER');
INSERT INTO Proprietaire (id, birthDate, email, firstName, lastName, password, role) VALUES (3, '1982-04-12', 'merilyne@yahoo.fr', 'Marie', 'Dewalle', 'password', 'ROLE_USER');
INSERT INTO Proprietaire (id, birthDate, email, firstName, lastName, password, role) VALUES (4, '1985-12-25', 'joe@test.fr', 'Joe', 'Dupont', 'password', 'ROLE_USER');

INSERT INTO Animal (race, id, dateDeNaissance, nom, proprietaire_id) VALUES ('TORTUE', 1, '1980-02-15', 'Donatello', 2);
INSERT INTO Animal (race, id, dateDeNaissance, nom, proprietaire_id) VALUES ('CHAT', 2, '1999-12-12', 'Bip', 1);
INSERT INTO Animal (race, id, dateDeNaissance, nom, proprietaire_id)VALUES ('CHIEN', 3, '2000-11-12', 'Titi', 1);
INSERT INTO Animal (race, id, dateDeNaissance, nom, proprietaire_id) VALUES ('CHEVAL', 4, '2010-05-18', 'Toto', 1);

INSERT INTO Vaccin (id, inoculation, rappel, type, animal_id, emailSent) VALUES (1, '1111-11-11', '2015-07-03', 'typhus', 1, false);
INSERT INTO Vaccin (id, inoculation, rappel, type, animal_id, emailSent) VALUES (2, '1111-11-11', '2015-07-04', 'rage', 1, false);
