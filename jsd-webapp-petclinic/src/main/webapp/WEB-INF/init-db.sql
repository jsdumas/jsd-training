DELETE FROM Vaccin;
DELETE FROM Animal;
DELETE FROM Proprietaire;

INSERT INTO Proprietaire (id, birthDate, email, firstName, lastName, password, role) VALUES (1, '1980-02-15', 'john.doe@test.fr', 'John', 'Doe', 'password', 'ROLE_USER');
INSERT INTO Proprietaire (id, birthDate, email, firstName, lastName, password, role) VALUES (2, '1996-04-22', 'treeptik.petclinic@gmail.com', 'Petclinic', 'Treeptik', 'password', 'ROLE_USER');
INSERT INTO Proprietaire (id, birthDate, email, firstName, lastName, password, role) VALUES (3, '1982-04-12', 'merilyne@yahoo.fr', 'Marie', 'Dewalle', 'password', 'ROLE_USER');
INSERT INTO Proprietaire (id, birthDate, email, firstName, lastName, password, role) VALUES (4, '1985-12-25', 'joe@test.fr', 'Joe', 'Dupont', 'password', 'ROLE_USER');

INSERT INTO Animal VALUES ('TORTUE', 1, '1980-02-15', 'Donatello', 2);
INSERT INTO Animal VALUES ('CHAT', 2, '1999-12-12', 'Bip', 1);
INSERT INTO Animal VALUES ('CHIEN', 3, '2000-11-12', 'Titi', 1);
INSERT INTO Animal VALUES ('CHEVAL', 4, '2010-05-18', 'Toto', 1);

INSERT INTO Vaccin (id, inoculation, rappel, type, animal_id, emailSent) VALUES (1, '1111-11-11', '2015-07-03', 'typhus', 1, false);
INSERT INTO Vaccin (id, inoculation, rappel, type, animal_id, emailSent) VALUES (2, '1111-11-11', '2015-07-04', 'rage', 1, false);
