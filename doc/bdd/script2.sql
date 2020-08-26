#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: hotel
#------------------------------------------------------------

CREATE TABLE hotel(
        id         Int  Auto_increment  NOT NULL ,
        nbChambre  Int NOT NULL ,
        dateAjout  Date NOT NULL ,
        dateModif  Date ,
        dateDelete Date
	,CONSTRAINT hotel_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: chambre
#------------------------------------------------------------

CREATE TABLE chambre(
        id         Int  Auto_increment  NOT NULL ,
        numero     Varchar (5) NOT NULL ,
        nbPax      Int NOT NULL ,
        dateAjout  Date NOT NULL ,
        dateModif  Date ,
        dateDelete Date ,
        id_hotel   Int NOT NULL
	,CONSTRAINT chambre_PK PRIMARY KEY (id)

	,CONSTRAINT chambre_hotel_FK FOREIGN KEY (id_hotel) REFERENCES hotel(id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: client
#------------------------------------------------------------

CREATE TABLE client(
        id            Int  Auto_increment  NOT NULL ,
        nom           Varchar (20) NOT NULL ,
        prenom        Varchar (20) NOT NULL ,
        dateNaissance Date NOT NULL ,
        mail          Varchar (50) NOT NULL ,
        dateAjout     Date NOT NULL ,
        dateModif     Date ,
        dateDelete    Date
	,CONSTRAINT client_PK PRIMARY KEY (id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: reservation
#------------------------------------------------------------

CREATE TABLE reservation(
        id          Int  Auto_increment  NOT NULL ,
        numReserv   Int NOT NULL ,
        nbPers      Int NOT NULL ,
        prix        Float NOT NULL ,
        nbCb        Varchar (16) NOT NULL ,
        dateArrivee Date NOT NULL ,
        dateReserv  Date NOT NULL ,
        dateModif   Date ,
        dateDelete  Date ,
        id_chambre  Int NOT NULL ,
        id_client   Int NOT NULL
	,CONSTRAINT reservation_PK PRIMARY KEY (id)

	,CONSTRAINT reservation_chambre_FK FOREIGN KEY (id_chambre) REFERENCES chambre(id)
	,CONSTRAINT reservation_client0_FK FOREIGN KEY (id_client) REFERENCES client(id)
)ENGINE=InnoDB;

