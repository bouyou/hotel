package hotel.hotel.utils;
import hotel.hotel.entities.Client;
import hotel.hotel.service.ServiceClient;
import java.text.ParseException;
import java.util.Scanner;

public class Menu<Static> {
    public static Scanner clavier = new Scanner(System.in);
    public static Integer choix;

    public static void showMainMenu() throws ParseException {
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

    private static void showGestionClient() throws ParseException {
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

    private static void showAjoutClient() throws ParseException {
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
        c.setDateAjout(new java.util.Date());
        c.setIdHotel(1);
        c.setDateModif(new java.util.Date());
        ServiceClient serviceClient = new ServiceClient();
        serviceClient.create(c);

        System.out.println("Vous avez ajouter le client : " + c.getNom() + " " + c.getPrenom());
        System.out.println("Date de naissance : " + c.getDateNaissance());
        System.out.println("Adresse mail : " + c.getMail());
    }


    private static void showModifClient() throws ParseException {
        System.out.println("je suis dans modification d'un Client");
        ServiceClient serviceClient = new ServiceClient();
        Client c = serviceClient.chooseClientById(3);
        c.setNom(Validation.checkNom());
        System.out.println("nom"  +  c.getNom());
        c.setPrenom(Validation.checkPrenom());
        System.out.println("prenom"  +  c.getPrenom());
        c.setDateNaissance(Validation.checkDateNaissance());
        System.out.println("Date de naissance (yyyy-mm-dd) : "  +  c.getDateNaissance());
        c.setMail(Validation.checkMail());
        System.out.println("Adresse mail : "  +  c.getMail());
        c.setDateModif(new java.util.Date());
        serviceClient.modif(c);
        System.out.println("vous avez modifie le client : " + c.getNom() + " " + c.getPrenom());
        System.out.println("Date de naissance : " + c.getDateNaissance());
        System.out.println("Adresse mail : " + c.getMail());
    }

    private static void showSupprClient() {
        System.out.println("je suis dans supprimer un Client");
        ServiceClient serviceClient = new ServiceClient();
        Client c = serviceClient.chooseClientById(3);
        c.setNom(Validation.checkNom());
        System.out.println("nom"  +  c.getNom());
        c.setPrenom(Validation.checkPrenom());
        System.out.println("prenom"  +  c.getPrenom());
        c.setDateDelete(new java.util.Date());
        serviceClient.delete(c);
        System.out.println("vous avez supprimé le client : " + c.getNom() + " " + c.getPrenom());
    }

    private static void showGestionHotel() throws ParseException {
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

    private static void showAjoutHotel() {
        System.out.println("je suis dansajouter un Client");
    }
    private static void showModifHotel() {
        System.out.println("je suis dans modification d'un Client");
    }
    private static void showSupprHotel() {
        System.out.println("je suis dans supprimer un Client");
    }

    private static void showGestionChambre() throws ParseException {
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

    private static void showGestionReservation() throws ParseException {
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

    private static void showQuitter() {
        System.out.println("---- A BIENTOT ----");
    }
}



