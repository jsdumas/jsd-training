CREATE DATABASE IF NOT EXISTS realestatemanager;

USE realestatemanager;

DROP TABLE IF EXISTS Logement_datesAnnonce;
DROP TABLE IF EXISTS Logement_datesDebutLocation;
DROP TABLE IF EXISTS Logement;
DROP TABLE IF EXISTS Quartier;
DROP TABLE IF EXISTS Commune;
DROP TABLE IF EXISTS TypeLogement;
DROP TABLE IF EXISTS Individu;



CREATE TABLE Logement(
id INT NOT NULL,
estDispo TINYINT,
superficie INT NOT NULL,
nomRue VARCHAR(40) NOT NULL,
numeroRue VARCHAR(5),
loyer DOUBLE,
proprietaire INT NOT NULL,
typeLogement INT NOT NULL,
quartier INT NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE Quartier(
id INT NOT NULL,
libelleQuartier VARCHAR(120) NOT NULL,
commune_id INT NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE Commune(
id INT NOT NULL,
distanceAgence VARCHAR(50) NOT NULL,
nomCommune VARCHAR(120) NOT NULL,
nombreHabitants INT,
PRIMARY KEY (id)
);

CREATE TABLE TypeLogement(
id INT NOT NULL,
charges DOUBLE,
PRIMARY KEY (id)
);

CREATE TABLE Individu(
id INT NOT NULL,
datedeNaissance DATE NOT NULL,
nom VARCHAR(50) NOT NULL,
numeroTelephone VARCHAR(50)NOT NULL,
prenom VARCHAR(50)NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE Logement_datesAnnonce(
id INT NOT NULL,
dateAnnonce DATE NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE Logement_datesDebutLocation(
id INT NOT NULL,
dateDebutLocation DATE NOT NULL,
PRIMARY KEY (id)
);


insert into Commune (id, distanceAgence, nomCommune, nombreHabitants) values (1, 30, 'Marignane', 6000);
insert into Commune (id, distanceAgence, nomCommune, nombreHabitants) values (2, 25, 'Vitrolles', 5000);
insert into Commune (id, distanceAgence, nomCommune, nombreHabitants) values (3, 20, 'Les Pennes Mirabeau', 4500);


insert into Quartier (id, libelleQuartier, commune_id) values (1, 'Méditerranée Parc', 1);
insert into Quartier (id, libelleQuartier, commune_id) values (2, 'Parc Hélène Boucher', 1);
insert into Quartier (id, libelleQuartier, commune_id) values (3, 'Bastide blanche', 2);
insert into Quartier (id, libelleQuartier, commune_id) values (4, 'La Frescoule', 2);
insert into Quartier (id, libelleQuartier, commune_id) values (5, 'La Cannai', 3);
insert into Quartier (id, libelleQuartier, commune_id) values (6, 'Les Pergolas fleuries', 3);

insert into TypeLogement (id, charges) values (1, 300);
insert into TypeLogement (id, charges) values (2, 350);
insert into TypeLogement (id, charges) values (3, 400);

insert into Individu (id, datedeNaissance, nom, numeroTelephone, prenom) values (1, '1960-07-12', 'Imbert', '0612569874', 'Paul');
insert into Individu (id, datedeNaissance, nom, numeroTelephone, prenom) values (2, '1953-02-18', 'Durand', '0612635425', 'Pierre');
insert into Individu (id, datedeNaissance, nom, numeroTelephone, prenom) values (3, '1975-04-03', 'Duhamel', '0456985224', 'Jacques');
insert into Individu (id, datedeNaissance, nom, numeroTelephone, prenom) values (4, '1952-03-08', 'Dargilo', '0421459632', 'Albert');
insert into Individu (id, datedeNaissance, nom, numeroTelephone, prenom) values (5, '1980-05-02', 'Gobert', '0745963212', 'Françoise');
insert into Individu (id, datedeNaissance, nom, numeroTelephone, prenom) values (6, '1958-03-14', 'Dacunto', '0645896325', 'Denise');

insert into Logement (id, estDispo, superficie, nomRue, numeroRue, loyer, proprietaire, typeLogement, quartier) values (1, 0, 550, 'Rue du puisatier', '9', 90, 1, 1, 1);
insert into Logement (id, estDispo, superficie, nomRue, numeroRue, loyer, proprietaire, typeLogement, quartier) values (2, 1, 600, 'Rue Anatole France', '10', 80, 2, 2, 2);
insert into Logement (id, estDispo, superficie, nomRue, numeroRue, loyer, proprietaire, typeLogement, quartier) values (3, 1, 700, 'Rue Frédéric Mistral', '8', 70, 3, 3, 3);
insert into Logement (id, estDispo, superficie, nomRue, numeroRue, loyer, proprietaire, typeLogement, quartier) values (4, 1, 750, 'Rue Maréchal Joffre', '2', 85, 4, 4, 1);
insert into Logement (id, estDispo, superficie, nomRue, numeroRue, loyer, proprietaire, typeLogement, quartier) values (5, 1, 800, 'Boulevard Charles de Gaulle', '4 bis', 100, 5, 5, 2);
insert into Logement (id, estDispo, superficie, nomRue, numeroRue, loyer, proprietaire, typeLogement, quartier) values (6, 0, 900, 'Boulevard Carnot', '1', 110, 6, 6, 3);

insert into Logement_datesAnnonce (id, dateAnnonce) values (1, '2015-04-23');
insert into Logement_datesAnnonce (id, dateAnnonce) values (2, '2015-04-24');
insert into Logement_datesAnnonce (id, dateAnnonce) values (3, '2015-04-25');
insert into Logement_datesAnnonce (id, dateAnnonce) values (4, '2015-04-26');
insert into Logement_datesAnnonce (id, dateAnnonce) values (5, '2015-04-27');
insert into Logement_datesAnnonce (id, dateAnnonce) values (6, '2015-04-28');

insert into Logement_datesDebutLocation (id, dateDebutLocation) values (1, '2015-04-30');
insert into Logement_datesDebutLocation (id, dateDebutLocation) values (6, '2015-05-04');



