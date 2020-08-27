package hotel.hotel.utils;

public class Validation {

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
            response[1] = "Veuillez entrer la donnée demandee";

        }else if( i.compareTo(length) == 1  ) {
            response[2] = "Veuillez taper moins de " + length + " caractères ";
        }
        return  response;
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

}