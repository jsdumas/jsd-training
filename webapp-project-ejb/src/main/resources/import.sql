
delete from Formation_Formateur;
delete from Session_Stagiaire;
delete from Session_Evaluation;
delete from Evaluation;

delete from Formateur;
delete from Stagiaire;
delete from Formation;
delete from Session;

delete from Utilisateur;
delete from Role;
delete from Utilisateur_Role;

INSERT INTO Formateur (id, nom, prenom, entreprise, poste) VALUES(1, "Aubert", "Julien", "Areva", "Ingénieur");
INSERT INTO Formateur (id, nom, prenom, entreprise, poste) VALUES(2, "Dujardin", "Jean", "Orange", "technicien");
INSERT INTO Formateur (id, nom, prenom, entreprise, poste) VALUES(3, "Thomas", "Eric", "Bull", "Manager");


INSERT INTO Stagiaire (id, nom, prenom, dateDeNaissance, email, nbJourDispo) VALUES(1, "Auriol", "Marc", '1980-02-04', 'marc.auriol@areva.fr', 7);
INSERT INTO Stagiaire (id, nom, prenom, dateDeNaissance, email, nbJourDispo) VALUES(2, "Dupont", "Leon", '1976-04-07', 'leon.dupont@orange.fr', 15);
INSERT INTO Stagiaire (id, nom, prenom, dateDeNaissance, email, nbJourDispo) VALUES(3, "Lucida", "Marion", '1990-01-23', 'marion.lucida@bull.fr', 25);


INSERT INTO Formation (id, difficulte, duree, intitule) VALUES(1, 5, 5, "Spring");
INSERT INTO Formation (id, difficulte, duree, intitule) VALUES(2, 6, 3, "Struts");
INSERT INTO Formation (id, difficulte, duree, intitule) VALUES(3, 8, 10, "JSF");


INSERT INTO Formation_Formateur (Formation_id, Formateur_id) VALUES(1, 1);
INSERT INTO Formation_Formateur (Formation_id, Formateur_id) VALUES(1, 2);
INSERT INTO Formation_Formateur (Formation_id, Formateur_id) VALUES(1, 3);
INSERT INTO Formation_Formateur (Formation_id, Formateur_id) VALUES(2, 1);
INSERT INTO Formation_Formateur (Formation_id, Formateur_id) VALUES(2, 2);
INSERT INTO Formation_Formateur (Formation_id, Formateur_id) VALUES(2, 3);
INSERT INTO Formation_Formateur (Formation_id, Formateur_id) VALUES(3, 1);
INSERT INTO Formation_Formateur (Formation_id, Formateur_id) VALUES(3, 2);
INSERT INTO Formation_Formateur (Formation_id, Formateur_id) VALUES(3, 3);

INSERT INTO Session (id, dateDeDebut, dateDeFin, formateur_id, formation_id) VALUES(1, '2015-06-01', '2015-06-05', 1, 1);
INSERT INTO Session (id, dateDeDebut, dateDeFin, formateur_id, formation_id) VALUES(2, '2015-07-10', '2015-07-15', 2, 2);
INSERT INTO Session (id, dateDeDebut, dateDeFin, formateur_id, formation_id) VALUES(3, '2015-08-20', '2015-08-29', 3, 3);

INSERT INTO Session_Stagiaire (session_id, stagiaire_id) VALUES(1,1);
INSERT INTO Session_Stagiaire (session_id, stagiaire_id) VALUES(1,2);
INSERT INTO Session_Stagiaire (session_id, stagiaire_id) VALUES(2,2);
INSERT INTO Session_Stagiaire (session_id, stagiaire_id) VALUES(2,3);
INSERT INTO Session_Stagiaire (session_id, stagiaire_id) VALUES(3,1);
INSERT INTO Session_Stagiaire (session_id, stagiaire_id) VALUES(3,2);
INSERT INTO Session_Stagiaire (session_id, stagiaire_id) VALUES(3,3);

INSERT INTO Evaluation (session_id, stagiaire_id, dateCourante, note) VALUES(1, 1, '2015-06-06', 8);
INSERT INTO Evaluation (session_id, stagiaire_id, dateCourante, note) VALUES(1, 2, '2015-06-06', 6);
INSERT INTO Evaluation (session_id, stagiaire_id, dateCourante, note) VALUES(2, 2, '2015-07-16', 5);
INSERT INTO Evaluation (session_id, stagiaire_id, dateCourante, note) VALUES(2, 3, '2015-07-16', 9);
INSERT INTO Evaluation (session_id, stagiaire_id, dateCourante, note) VALUES(3, 1, '2015-08-30', 9);
INSERT INTO Evaluation (session_id, stagiaire_id, dateCourante, note) VALUES(3, 2, '2015-08-30', 8);
INSERT INTO Evaluation (session_id, stagiaire_id, dateCourante, note) VALUES(3, 3, '2015-08-30', 7);

INSERT INTO Session_Evaluation (session_id, evaluations_session_id, evaluations_stagiaire_id) VALUES(1, 1, 1);
INSERT INTO Session_Evaluation (session_id, evaluations_session_id, evaluations_stagiaire_id) VALUES(1, 1, 2);
INSERT INTO Session_Evaluation (session_id, evaluations_session_id, evaluations_stagiaire_id) VALUES(2, 2, 2);
INSERT INTO Session_Evaluation (session_id, evaluations_session_id, evaluations_stagiaire_id) VALUES(2, 2, 3);
INSERT INTO Session_Evaluation (session_id, evaluations_session_id, evaluations_stagiaire_id) VALUES(3, 3, 1);
INSERT INTO Session_Evaluation (session_id, evaluations_session_id, evaluations_stagiaire_id) VALUES(3, 3, 2);
INSERT INTO Session_Evaluation (session_id, evaluations_session_id, evaluations_stagiaire_id) VALUES(3, 3, 3);

CREATE TABLE Utilisateur (id INT NOT NULL AUTO_INCREMENT,login VARCHAR(30) NOT NULL, password VARCHAR(30) NOT NULL, PRIMARY KEY (id));
CREATE TABLE Role (id INT NOT NULL AUTO_INCREMENT,description VARCHAR(30) NOT NULL, PRIMARY KEY (id));
CREATE TABLE Utilisateur_Role (UTILISATEUR_ID INTEGER, ROLE_ID INTEGER);

INSERT INTO Utilisateur (id, login, password) VALUES (1, "admin", "admin");
INSERT INTO Role (id, description) VALUES (1, "ROLE_USER");
INSERT INTO Role (id, description) VALUES (2, "ROLE_ADMIN");

INSERT INTO Utilisateur_Role (Utilisateur_id, Role_id) VALUES (1, 1);
INSERT INTO Utilisateur_Role (Utilisateur_id, Role_id) VALUES (1, 2);



