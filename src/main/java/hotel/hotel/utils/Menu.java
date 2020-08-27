package hotel.hotel.utils;

import hotel.hotel.entities.Client;
import hotel.hotel.entities.Hotel;
import hotel.hotel.service.ServiceClient;
import hotel.hotel.service.ServiceHotel;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Menu<Static> {
    public static Scanner clavier = new Scanner(System.in);
    public static Integer choix;

    public static void showMainMenu(){
        System.out.println("---- BIENVENUE ----");
        System.out.println("Menu Principal : ");

        do {
            System.out.println("Sommaire");
            System.out.println("1 : Gestion Clients");
            System.out.println("2 : Gestion Hotels");
            System.out.println("3 : Gestion Chambres");
            System.out.println("4 : Gestion Reservations");
            System.out.println("0 : Quitter ");
            System.out.println("Choix : ");
            choix = clavier.nextInt();
            switch(choix){
                case 1 : Menu.showGestionClient();
                    break;
                case 2 : Menu.showGestionHotel();
                    break;
                case 3 : Menu.showGestionChambre();
                    break;
                case 4 : Menu.showGestionReservation();
                    break;
                case 0 : Menu.showQuitter();
                    break;
            }
            break;
        }
        while(choix!=0);
    }

    //--------------------------menu client---------------------------------------
    private static void showGestionClient() {
        System.out.println("je suis dans menu Gestion Client");
        do {
            System.out.println("1 : Ajouter un Client");
            System.out.println("2 : Modifier un Client");
            System.out.println("3 : Supprimer un Client");
            System.out.println("4 : Retour au menu principal");
            System.out.println("0 : Quitter ");
            System.out.println("Choix : ");
            choix = clavier.nextInt();
            switch(choix){
                case 1 : Menu.showAjoutClient();
                    break;
                case 2 : Menu.showModifClient();
                    break;
                case 3 : Menu.showSupprClient();
                    break;
                case 4 : Menu.showMainMenu();
                    break;
                case 0 : Menu.showQuitter();
                    break;
            }
        }
        while(choix!=0);
    }

    private static void showAjoutClient() {
        System.out.println("je suis dans ajouter un Client");
        Client c = new Client();
        String[] response = new String[3];
        response[0] = "false";

        c.setNom(Validation.checkNom());
        System.out.println("nom"  +  c.getNom());

        c.setPrenom(Validation.checkPrenom());
        System.out.println("prenom"  +  c.getPrenom());

        c.setDateNaissance(Validation.checkDateNaissance());
        System.out.println("Date de naissance (yyyy-mm-dd) : "  +  c.getDateNaissance());

        c.setMail(Validation.checkMail());
        System.out.println("Adresse mail : "  +  c.getMail());


        //Mail
        /*do{
            System.out.println("Entrez l'adresse mail : ");
            String value =  clavier.next();
            response = Validation.checkString(value, 255);

            if(response[0] == "false"){
                System.out.println(Validation.formatResponse("Adresse mail", response));
            }
        }while(response[0] ==  "false");
        c.setMail(response[3]);*/

        //Date ajout
        c.setDateAjout(new java.util.Date());
        c.setIdHotel(1);
        c.setDateModif(new java.util.Date());

        ServiceClient serviceClient = new ServiceClient();
        serviceClient.create(c);

        System.out.println("Vous avez ajouter le client : " + c.getNom() + " " + c.getPrenom());
        System.out.println("Date de naissance : " + c.getDateNaissance());
        System.out.println("Adresse mail : " + c.getMail());
    }

    private static void showModifClient() {
        System.out.println("je suis dans modification d'un Client");
        Client c = new Client();
        String[] response = new String[3];
        response[0] = "false";

        c.setNom(Validation.checkNom());

        System.out.println("Entrez le nouveau prenom : ");
        c.setPrenom(clavier.next());
        System.out.println("Entrez la nouvelle date de naissance : ");
        c.setDateNaissance(Date.valueOf(clavier.next()));
        System.out.println("Entrez la nouvelle adresse mail : ");
        c.setMail(clavier.next());
        System.out.println("vous avez ajouter le client : " + c.getNom() + " " + c.getPrenom());
        System.out.println("Date de naissance : " + c.getDateNaissance());
        System.out.println("Adresse mail : " + c.getMail());
    }

    private static void showSupprClient() {
        System.out.println("je suis dans supprimer un Client");
        Client c = new Client();
        System.out.println("Entrez le nom : ");
        c.setNom(clavier.next());
        System.out.println("Entrez le prenom : ");
        c.setPrenom(clavier.next());
        System.out.println("vous avez supprimé le client : " + c.getNom() + " " + c.getPrenom());
    }

    //-------------------------menu hotel----------------------------------------------------
    private static void showGestionHotel() {
        System.out.println("je suis dans menu Gestion Hotel");
        do {
            System.out.println("1 : Ajouter un Hotel");
            System.out.println("2 : Modifier un Hotel");
            System.out.println("3 : Supprimer un Hotel");
            System.out.println("4 : Retour au menu principal");
            System.out.println("0 : Quitter ");
            System.out.println("Choix : ");
            choix = clavier.nextInt();
            switch(choix){
                case 1 : Menu.showAjoutHotel();
                    break;
                case 2 : Menu.showModifHotel();
                    break;
                case 3 : Menu.showSupprHotel();
                    break;
                case 4 : Menu.showMainMenu();
                    break;
                case 0 : Menu.showQuitter();
                    break;
            }
        }
        while(choix!=0);
    }

    /**
     * menu pour d'ajouter un hotel
     */
    private static void showAjoutHotel() {
        System.out.println("je suis dans ajouter un Hotel");
        Hotel h = new Hotel();
        System.out.println("Entrez le nombre de chambres : ");
        int value =  clavier.nextInt();
        //appel methode pour ajouter nombre de chambres
        h.setNbChambre(Validation.checkNbChambre(value));
        System.out.println("Nombre de chambre enregisté"  +  h.getNbChambre());

        h.setDateAjout(new java.util.Date());

        ServiceHotel serviceHotel = new ServiceHotel();
        serviceHotel.create(h);
    }

    /**
     * menu pour modifier un hotel
     */
    private static void showModifHotel() {
        System.out.println("je suis dans modification d'un Hotel");

        //affiche la liste des hotal
        ServiceHotel servicehotel = new ServiceHotel();
        List<Hotel> allHotels = servicehotel.repo.findAll();
        for (Hotel h : allHotels) {
            System.out.println("hotel numero:"+h.getId()+" nb de chambres:"+h.getNbChambre());
        }

        //choix de l'hotel a modifier
        System.out.println("Choisir le numero de l'hotel à modifier");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        //recuperation de l'hotel à modifier
        Hotel hotel = servicehotel.chooseHotelById(id);
        System.out.println("cet hotel a "+hotel.getNbChambre()+" chambres");
        //modification des parametres a modifier
        System.out.println("quel est le nouveau nombre de chambre?");
        int nb = scanner.nextInt();
        hotel.setNbChambre(Validation.checkNbChambre(nb));
        hotel.setDateModif(new java.util.Date());
        //update de l'hotel
        ServiceHotel serviceHotel = new ServiceHotel();
        serviceHotel.modif(hotel);

    }

    /**
     * menu pour de supprimer un hotel
     */
    private static void showSupprHotel() {

        System.out.println("je suis dans supprimer un Hotel");

        //affiche liste des hotels
        ServiceHotel servicehotel = new ServiceHotel();
        List<Hotel> allHotels = servicehotel.repo.findAll();
        for (Hotel h : allHotels) {
            System.out.println("hotel numero:"+h.getId()+" nb de chambres:"+h.getNbChambre());
        }
        //choisir l'hotel a supprimer
        System.out.println("Choisir l'id de l'hotel à supprimer");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        //récupérer hotel choisi
        Hotel hotelToDelete= servicehotel.chooseHotelById(id);
        //supprimer cet hotel
        servicehotel.delete(hotelToDelete);
        System.out.println("cet hotel a été supprimé");
    }

    //-------------------------menu chambre -------------------------------------------------
    private static void showGestionChambre() {
        System.out.println("je suis dans menu Gestion Chambre");
        do {
            System.out.println("1 : Ajouter une Chambre");
            System.out.println("2 : Modifier une Chambre");
            System.out.println("3 : Supprimer une Chambre");
            System.out.println("4 : Retour au menu principal");
            System.out.println("0 : Quitter ");
            System.out.println("Choix : ");
            choix = clavier.nextInt();
            switch(choix){
                case 1 : Menu.showAjoutChambre();
                    break;
                case 2 : Menu.showModifChambre();
                    break;
                case 3 : Menu.showSupprChambre();
                    break;
                case 4 : Menu.showMainMenu();
                    break;
                case 0 : Menu.showQuitter();
                    break;
            }
        }
        while(choix!=0);
    }

    private static void showAjoutChambre() {
        System.out.println("je suis dans ajouter une Chambre");
    }

    private static void showModifChambre() {
        System.out.println("je suis dans modification d'une Chambre");
    }

    private static void showSupprChambre() {
        System.out.println("je suis dans supprimer une Chambre");
    }

    //----------------------------menu reservation---------------------------------------
    private static void showGestionReservation() {
        System.out.println("je suis dans menu Gestion Reservation");
        do {
            System.out.println("1 : Ajouter une Reservation");
            System.out.println("2 : Modifier une Reservation");
            System.out.println("3 : Supprimer une Reservation");
            System.out.println("4 : Retour au menu principal");
            System.out.println("0 : Quitter ");
            System.out.println("Choix : ");
            choix = clavier.nextInt();
            switch(choix){
                case 1 : Menu.showAjoutReservation();
                    break;
                case 2 : Menu.showModifReservation();
                    break;
                case 3 : Menu.showSupprReservation();
                    break;
                case 4 : Menu.showMainMenu();
                    break;
                case 0 : Menu.showQuitter();
                    break;
            }
        }
        while(choix!=0);
    }

    private static void showAjoutReservation() {
        System.out.println("je suis dans ajouter une Reservation");
    }

    private static void showModifReservation() {
        System.out.println("je suis dans modification d'une Reservation");
    }

    private static void showSupprReservation() {
        System.out.println("je suis dans supprimer une Reservation");
    }

    //------------------------------menu quitter------------------------------------
    private static void showQuitter() {
        System.out.println("---- A BIENTOT ----");
    }
}



