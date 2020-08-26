package hotel.hotel.utils;

import org.springframework.data.util.Pair;

import java.util.HashMap;

public class Validation {

    /**
     * checkString
     * @param s
     * @param length
     * @return void system.out
     */
    public static void checkString (String s, int length, String label){
        String[] response = new String[3];

        if(s == null  || s.isEmpty()){
            response[0] = "Erreur de saisie !  ";
            response[1] = "Veuillez entrer la donnée demandee";

        }else if( s.length() > length ) {
            response[0] = "Erreur de saisie  ! ";
            response[2] = "Veuillez taper moins de " + length + "caractères ";
        }
        System.out.println(formatResponse(label, response));
    }

    /**
     * Check Integer
     * @param i
     * @param length
     * @return void system.out
     */
    public static void checkInteger (Integer i, Integer length, String label){
        String[] response = new String[3];

        if(i == null || i == 0){
            response[0] = "Erreur de saisie !  ";
            response[1] = "Veuillez entrer la donnée demandee";

        }else if( i.compareTo(length) == 1  ) {
            response[0] = "Erreur de saisie  ! ";
            response[2] = "Veuillez taper moins de " + length + " caractères ";
        }
        if(response != null ){
            System.out.println(formatResponse(label, response));
        }
    }

    /**
     * String message formaté d'erreur de saisie
     * @param label
     * @param response
     * @return
     */
    private static String formatResponse(String label, String[] response ){

            /*
        System.out.println("0 -> " + response[0]);
        System.out.println("1 -> " + response[1]);
        System.out.println("2 -> " + response[2]);




        /*
        System.out.println("0 -> " + m0);
        System.out.println("1 -> " + m1);
        System.out.println("2 -> " + m2);
        */

        String m0 = response[0] != null  ?  response[0] : "";
        String m1 = response[1] != null  ?  response[1] : "";
        String m2 = response[2] != null  ?  response[2] : "";

        return  response[0] != null  ?   m0 + m1 + m2 + " pour ce champs " + label : "";
    }

}
