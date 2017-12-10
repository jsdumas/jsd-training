DELETE FROM Vaccin;
DELETE FROM Animal;
DELETE FROM Proprietaire;

INSERT IGNORE INTO Proprietaire (id,firstName, lastName, birthDate, email, password) values (1,'Dupont','Nicolas','1980-02-05','bla@email.fr','pass1');
INSERT IGNORE INTO Proprietaire (id,firstName, lastName, birthDate, email, password) values (2,'Frelon','Loic','1986-10-07','kou@email.fr','pass2');
INSERT IGNORE INTO Proprietaire (id,firstName, lastName, birthDate, email, password) values (3,'Cerno','Veron','1989-09-07','gtre@email.fr','pass3');

INSERT IGNORE INTO Animal(ANIMAL_TYPE,id,dateDeNaissance,nom,proprietaire_id) values("CHAT", 1,'2010-09-07','Titi', 1 );
INSERT IGNORE INTO Animal(ANIMAL_TYPE,id,dateDeNaissance,nom,proprietaire_id) values("CHEVAL", 2,'2012-05-02', 'Bruno', 2);
INSERT IGNORE INTO Animal(ANIMAL_TYPE,id,dateDeNaissance,nom,proprietaire_id) values("CHIEN", 3,'2011-11-26', 'Toto', 1 );

INSERT IGNORE INTO Vaccin(id, emailSent, inoculation, rappel, type, animal_id) VALUES (1, false, '1111-11-11', '2015-07-03', 'typhus', 1);
INSERT IGNORE INTO Vaccin(id, emailSent, inoculation, rappel, type, animal_id) VALUES (2, false, '1111-11-11', '2015-07-04', 'rage', 1);