package hotel.hotel.utils;

import java.util.Scanner;
import java.sql.Date;

import static java.util.Date.*;

public class Validation {


    public static Scanner clavier = new Scanner(System.in);
    /**
     * checkString
     * @param s
     * @param length
     * @return boolean
     */
    public static String[] checkString (String s, int length){
        String[] response = new String[4];

        response[0] = "true";
        response[3] = s;

        if(s == null  || s.isEmpty()){
            response[0] = "false";
            response[1] = "Veuillez entrer la donnée demandee";

        }else if( s.length() > length ) {
            response[0] = "false";
            response[2] = "Veuillez taper moins de " + length + " caractères ";
        }

        return  response;
    }

    /**
     * Check Integer
     * @param i
     * @param length
     * @return boolean
     */
    public static String[]checkInteger (Integer i, Integer length){
        String[] response = new String[4];
        response[3] =  i.toString();

        if(i == null || i == 0){
            response[0] = "false";
            response[1] = "Veuillez entrer la donnée demandee";

        }else if( i.compareTo(length) == 1  ) {
            response[0] = "false";
            response[2] = "Veuillez taper moins de " + length + " caractères ";
        }
        return  response;
    }

    /***
     * Check if nom is valid
     * @return
     */
    public static String checkNom(){
        String[] response = new String[3];
        response[0] = "false";
        String value ="";
        //Nom
        do{
            System.out.println("Entrez le nom : ");
            value =  clavier.next();
            response = Validation.checkString(value, 2);

            if(response[0] == "false"){
                System.out.println(Validation.formatResponse("Nom", response));
            }
        }while(response[0] ==  "false");
        return value;
    }

    /**
     * String message formaté d'erreur de saisie
     * @param label
     * @param response
     * @return
     */
    public static String formatResponse(String label, String[] response ){

        /*
        System.out.println("0 -> " + response[0]);
        System.out.println("1 -> " + response[1]);
        System.out.println("2 -> " + response[2]);
        /*
        System.out.println("0 -> " + m0);
        System.out.println("1 -> " + m1);
        System.out.println("2 -> " + m2);
        */


        String m1 = response[1] != null  ?  response[1] : "";
        String m2 = response[2] != null  ?  response[2] : "";

        return  m1 + m2 + " pour ce champs " + label;
    }

    public static Integer checkNbChambre(){
        String[] response = new String[3];
        response[0] = "false";
        Integer value =0;

        do{
            System.out.println("Entrez le nombre de chambres : ");
            value =  clavier.nextInt();
            response = Validation.checkInteger(value, 2);

            if(response[0] == "false"){
                System.out.println(Validation.formatResponse("Nombre de chambres", response));
            }
        }while(response[0] ==  "false");
        return value;
    }

    /**
     * check prenom
     * @return string
     */
    public static String checkPrenom() {
        String[] response = new String[3];
        response[0] = "false";
        String value ="";
        do{
            System.out.println("Entrez le prenom : ");
            value =  clavier.next();
            response = Validation.checkString(value, 255);

            if(response[0] == "false"){
                System.out.println(Validation.formatResponse("Prenom", response));
            }
        }while(response[0] ==  "false");
        return value;
    }

    /**
     * check Date Naissance
     * @return Date
     */
    public static Date checkDateNaissance() {
        String[] response = new String[3];
        response[0] = "false";
        String value ="";
        do{
            System.out.println("Entrez la date de naissance : ");
            value =  clavier.next();
            response = Validation.checkString(value, 10);

            if(response[0] == "false"){
                System.out.println(Validation.formatResponse("Date de naissance", response));
            }
        }while(response[0] ==  "false");
        return Date.valueOf(value);
    }

    /**
     * Check mail
     * @return string
     */
    public static String checkMail() {
        String[] response = new String[3];
        response[0] = "false";
        String value ="";
        do{
            System.out.println("Entrez l'adresse mail : ");
            value =  clavier.next();
            response = Validation.checkString(value, 50);

            if(response[0] == "false"){
                System.out.println(Validation.formatResponse("Adresse mail", response));
            }
        }while(response[0] ==  "false");
        return value;
    }

}
