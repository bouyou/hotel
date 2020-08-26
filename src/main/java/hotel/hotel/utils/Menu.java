package hotel.hotel.utils;

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
    }
    private static void showModifClient() {
        System.out.println("je suis dans modification d'un Client");
    }
    private static void showSupprClient() {
        System.out.println("je suis dans supprimer un Client");
    }
    private static void showIdClient() {
        System.out.println("je suis dans selectionner Id Client");
    }
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

    private static void showAjoutHotel() {
        System.out.println("je suis dansajouter un Client");
    }
    private static void showModifHotel() {
        System.out.println("je suis dans modification d'un Client");
    }
    private static void showSupprHotel() {
        System.out.println("je suis dans supprimer un Client");
    }

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

    private static void showQuitter() {
        System.out.println("---- A BIENTOT ----");
    }
}



