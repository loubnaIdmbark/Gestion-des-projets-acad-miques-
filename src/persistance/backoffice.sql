-- Active: 1681593016062@@localhost@3306@backoffice
drop database projetjava;
create database projetjava;
use projetjava;
#creation des tables 
#//////////////////////////////////////////////////////////////////////////////////////////////////////////////#
create table Entreprise(
	raison_sociale VARCHAR(250) NOT NULL,
	Adresse_Entreprise VARCHAR(250) NOT NULL,
	Telephone_Entreprise Varchar(250) NOT NULL,
	Email_entreprise VARCHAR(250) NOT NULL,
	Responsable_entreprise VARCHAR(250) NOT NULL,
	primary key(raison_sociale)
);
drop table if exists Departement;
create table Departement(
	id_departement Integer auto_increment Not NULL ,
	Nom_departement VARCHAR(20),
    chef_departement VARCHAR(20),
    primary key(id_departement)
);
create table Professeur (
	Id_professeur INTEGER AUTO_INCREMENT NOT NULL,
	nom_professeur VARCHAR(20) ,
	prenom_professeur VARCHAR(20) ,
	Email_professeur VARCHAR(200),
	Grade_professeur ENUM ("PH", "PES" ,"PA") not null,
    id_departement Integer Not null ,
	primary key(Id_professeur),
	foreign key(id_departement) REFERENCES Departement(id_departement))
;
CREATE TABLE Membre_Departement (
    id_departement INTEGER NOT NULL,#Dans cette table, on associe des professeurs à des départements en spécifiant leur ID respectifs. On n'a pas besoin d'un ID de membre car ici, chaque professeur est considéré comme membre d'un département de l'école. Donc, l'association est faite en utilisant les clés étrangères des tables Professeur et Departement. La clé primaire composée de (id_departement, id_professeur) garantit l'unicité de chaque ligne de la table./
    id_professeur INTEGER NOT NULL,
    PRIMARY KEY (id_departement, id_professeur),
    FOREIGN KEY (id_departement) REFERENCES Departement (id_departement),
    FOREIGN KEY (id_professeur) REFERENCES Professeur (Id_professeur)
);
create table Filiere(
	id_filiere Integer Not null auto_increment,
	Nom_filiere VARCHAR(200),
    id_departementFiliere Integer Not null,
    id_Coordonateur integer not null,
    primary key(id_filiere),
	foreign key(id_departementFiliere) REFERENCES Departement(id_departement),
    foreign key(id_Coordonateur) REFERENCES Membre_Departement(id_professeur)
);





create table Laboratoire(
	id_laboratoire Integer not null auto_increment ,
	Nom_laboratoire VARCHAR(20),
    email_laboratoire VARCHAR(250),
    Id_responsable integer NOT NULL ,
    primary key(id_laboratoire),
	foreign key(Id_responsable) REFERENCES Professeur(Id_professeur)

);
create table Etudiant (
	id_etudiant INTEGER AUTO_INCREMENT NOT NULL,
	CNE VARCHAR(20),
	nom_etudiant VARCHAR(20) ,
	prenom_etudiant VARCHAR(20) ,
	Email_etudiant VARCHAR(200),
	Niveau_etudiant VARCHAR(20),
    id_filiere integer not null,
	primary key(id_etudiant),
	foreign key(id_filiere) REFERENCES Filiere(id_filiere)
);
drop table if exists Projet;
CREATE TABLE Projet(
	num_projet INTEGER NOT NULL AUTO_INCREMENT,
	titre_projet VARCHAR(20),
	Date_departProjet DATE,
	Type_projet VARCHAR(20) NOT NULL,
    id_labo INTEGER DEFAULT NULL,
    id_entreprise  VARCHAR(250) DEFAULT NULL,
    duree_projet INTEGER NOT NULL,
    id_etudiant INTEGER NOT NULL,
    Id_encadrant1 INTEGER NOT NULL,
    Id_encadrant2 INTEGER DEFAULT NULL,
	PRIMARY KEY(num_projet),
    FOREIGN KEY(Id_encadrant1) REFERENCES Professeur(Id_professeur),
    FOREIGN KEY(Id_encadrant2) REFERENCES Professeur(Id_professeur),
    CHECK (
		(Type_projet = "PFA" AND duree_projet <= 2) OR 
        (Type_projet = "PFE" AND duree_projet >= 5 AND duree_projet <= 6) OR 
        (Type_projet = "doctorat" AND duree_projet >= 36 AND duree_projet <= 72)
	),
    Foreign Key (id_labo) REFERENCES Laboratoire(id_laboratoire),
    Foreign Key (id_entreprise) REFERENCES Entreprise(raison_sociale),
    Foreign Key (id_etudiant) REFERENCES Etudiant(id_etudiant)
);
create table Etape(
	Id_etape INTEGER NOT NULL auto_increment,
	Duree_etape int ,
	Date_depareEtape date ,
    num_projet INTEGER NOT NULL ,
	Livraison_etape VARCHAR(20),
	primary key(Id_etape),
	foreign key(num_projet) REFERENCES projet(num_projet)

);

#drop table etape;
create  table documentation(
	id integer auto_increment not null ,
    etape_id Integer not null ,
    fichier text not null ,
    primary key(id),
    foreign key(etape_id) references Etape(Id_etape)
);

drop table documentation;

CREATE TABLE Membre_Laboratoire_doctorants(
    id_membre INTEGER NOT NULL AUTO_INCREMENT,#L'attribut "id_membre" est une clé primaire artificielle qui permet d'identifier chaque membre de manière unique dans la table "Membre_Laboratoire". Cela signifie que chaque membre aura son propre identifiant de membre, indépendamment du fait qu'il soit étudiant ou professeur. Les attributs "id_professeur" et "CNE_doctorant" sont des clés étrangères qui référencent respectivement les tables "Professeur" et "Etudiant", pour lier chaque membre à son profil spécifique dans l'une de ces tables./
    id_doctorant INTEGER,
    id_laboratoire INTEGER NOT NULL,
    PRIMARY KEY(id_membre),
    FOREIGN KEY(id_doctorant) REFERENCES Etudiant(id_etudiant),
    FOREIGN KEY(id_laboratoire) REFERENCES Laboratoire(id_laboratoire)
);
CREATE TABLE Membre_Laboratoire_professeurs(
    id_membre INTEGER NOT NULL AUTO_INCREMENT,#L'attribut "id_membre" est une clé primaire artificielle qui permet d'identifier chaque membre de manière unique dans la table "Membre_Laboratoire". Cela signifie que chaque membre aura son propre identifiant de membre, indépendamment du fait qu'il soit étudiant ou professeur. Les attributs "id_professeur" et "CNE_doctorant" sont des clés étrangères qui référencent respectivement les tables "Professeur" et "Etudiant", pour lier chaque membre à son profil spécifique dans l'une de ces tables./
    id_professeur INTEGER,
    id_laboratoire INTEGER NOT NULL,
    PRIMARY KEY(id_membre),
    FOREIGN KEY(id_professeur) REFERENCES Professeur(Id_professeur),
    FOREIGN KEY(id_laboratoire) REFERENCES Laboratoire(id_laboratoire)
);

create table user(
    id_user integer not null auto_increment,
    username varchar(200) not null,
    password varchar(200) not null,
    type varchar(200) not null,
    primary key(id_user)
);

SELECT * FROM user;

insert into user(username,password,type) values('admin1','admin','Super User');
insert into user(username,password,type) values('chef','chef','chef');

insert into user(username,password,type) values('coor','coor','coordinateur');

insert into user(username,password,type) values('direc','direc','directeur');

select type from user where username='chef' and password='chef';

INSERT into departement values(0,'departement1',1);

SELECT * FROM departement;

#insert into membre_departement values(1,1);

#insert into filiere values (0, 'GI', 1 , 1);

SELECT  * FROM filiere;
insert into professeur values(0,'chef','chef','@gmail.com','PH',1);
select * from professeur;

/*insert un exemple dans tout les TABLES*/

insert into departement values(0,'departement1',1);
insert into professeur values(0,'chef','chef','@gmail.com','PH',1);

insert into professeur VALUES(0,'p1','professeur1','@gmail.com','PH',1);

select * from etudiant;

insert into entreprise values('Entreprise','adresse1','tel1','fax1','site1');

SELECT * FROM entreprise;

SELECT * FROM projet;
#insert into Projet(num_projet , titre_projet , Date_departProjet ,Type_projet ,id_entreprise,duree_projet,id_etudiant ,Id_encadrant1)  values(0,'titre1','2020-01-01','PFE','Entreprise',5,2,1);

select * from laboratoire;

insert into laboratoire values(0,'laboratoire1','adresse1',1);

insert into departement values(0,'Genie Informatique',2);
insert into professeur values(0,'EL MOUSSAID','EL MOUSSAID','@gmail.com','PH',2);
#insertion :
INSERT INTO Entreprise (raison_sociale, Adresse_Entreprise, Telephone_Entreprise, Email_entreprise, Responsable_entreprise) 
VALUES
#('Microsoft', '1 Microsoft Way Redmond, Washington, United States', '+1 425-882-8080', 'info@microsoft.com', 'Satya Nadella'),
('Amazon', '410 Terry Ave N, Seattle, WA 98109, United States', '+1 206-266-1000', 'info@amazon.com', 'Jeff Bezos'),
('Google', '1600 Amphitheatre Parkway, Mountain View, California, United States', '+1 650-253-0000', 'info@google.com', 'Sundar Pichai'),
('Tesla', '3500 Deer Creek Rd, Palo Alto, California, United States', '+1 650-681-5100', 'info@tesla.com', 'Elon Musk'),
('IBM', '1 New Orchard Road Armonk, New York, United States', '+1 914-499-1900', 'info@ibm.com', 'Arvind Krishna'),
('Facebook', '1 Hacker Way, Menlo Park, California, United States', '+1 650-308-7300', 'info@facebook.com', 'Mark Zuckerberg');






INSERT INTO Departement (Nom_departement, chef_departement)
VALUES
('Génie Civil', 'Jane Doe'),
('Electronique', 'James Smith'),
('Management', 'Mary Johnson'),
('Génie Mécanique', 'Robert Brown'),
('Mathématiques', 'Karen Davis');






INSERT INTO Professeur (nom_professeur, prenom_professeur, Email_professeur, Grade_professeur, id_departement)
VALUES
('Doe', 'John', 'johndoe@univ.ma', 'PA', 1),
('Doe', 'Jane', 'janedoe@univ.ma', 'PH', 2),
('Smith', 'James', 'jamessmith@univ.ma', 'PES', 3),
('Johnson', 'Mary', 'maryjohnson@univ.ma', 'PA', 4),
('Brown', 'Robert', 'robertbrown@univ.ma', 'PH', 5),
('Davis', 'Karen', 'karendavis@univ.ma', 'PES', 6);









INSERT INTO Membre_Departement (id_departement, id_professeur)
VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6);









INSERT INTO Filiere (Nom_filiere, id_departementFiliere, id_Coordonateur)
VALUES
('Génie Logiciel', 1, 1),
('Génie Civil', 2, 2),
('Electronique', 3, 3),
('Management', 4, 4),
('Génie Mécanique', 5, 5),
('Mathématiques', 6, 6);


/*INSERT INTO laboratoire (nom_laboratoire, adresse_laboratoire, telephone_laboratoire, email_laboratoire, directeur_laboratoire, domaine_recherche)
VALUES
('Labo 1', '123 Rue des Sciences', '01 23 45 67 89', 'labo1@example.com', 'John Doe', 'Biologie'),
('Labo 2', '456 Avenue de la Technologie', '02 34 56 78 90', 'labo2@example.com', 'Jane Smith', 'Informatique'),
('Labo 3', '789 Boulevard de la Santé', '03 45 67 89 01', 'labo3@example.com', 'Bob Johnson', 'Médecine'),
('Labo 4', '987 Rue de la Physique', '04 56 78 90 12', 'labo4@example.com', 'Alice Brown', 'Physique'),
('Labo 5', '654 Avenue de la Chimie', '05 67 89 01 23', 'labo5@example.com', 'David Lee', 'Chimie'),
('Labo 6', '321 Boulevard de la Biologie', '06 78 90 12 34', 'labo6@example.com', 'Sarah Kim', 'Biologie');

*/


INSERT INTO Etudiant (CNE, nom_etudiant, prenom_etudiant, Email_etudiant, Niveau_etudiant, id_filiere)
VALUES 
('A12345', 'Doe', 'John', 'john.doe@example.com', 'Licence 3', 1),
('B23456', 'Smith', 'Emma', 'emma.smith@example.com', 'Licence 2', 2),
('C34567', 'Garcia', 'Lucas', 'lucas.garcia@example.com', 'Licence 1', 1),
('D45678', 'Lee', 'Michelle', 'michelle.lee@example.com', 'Master 2', 3),
('E56789', 'Chen', 'David', 'david.chen@example.com', 'Master 1', 2),
('F67890', 'Wang', 'Sophie', 'sophie.wang@example.com', 'Licence 3', 1),
('G78901', 'Kim', 'Andrew', 'andrew.kim@example.com', 'Licence 2', 2),
('H89012', 'Park', 'Hannah', 'hannah.park@example.com', 'Licence 1', 1),
('I90123', 'Nguyen', 'Daniel', 'daniel.nguyen@example.com', 'Master 2', 3),
('J01234', 'Gonzalez', 'Sofia', 'sofia.gonzalez@example.com', 'Master 1', 2);

select * from Etudiant ;
INSERT INTO Laboratoire (Nom_laboratoire, email_laboratoire, Id_responsable)
VALUES
('Physique', 'physique@univ.ma', 2),
('Biologie', 'biologie@univ.ma', 1),
('Informatique', 'informatique@univ.ma', 3),
('Chimie', 'chimie@univ.ma', 4),
('Génie Civil', 'gcivil@univ.ma', 6);
select * from Filiere;