package cosas;

public class Enter {
    static void main() {
        String palabraUno= "Comida";
        String palabraDos= "Comida";
        String palabraTres= "Cena";

        boolean comparacion= palabraUno.equals(palabraDos);
        boolean comparacion2= palabraDos.equals(palabraTres);

        System.out.printf("la comparación es %b %n ",comparacion);
        System.out.printf("la comparacion es %b %n",comparacion2);

        String palabraCuatro= "amar";
        String palabraCinco= "amar";
        String palabraSeis= "golpear";
        String palabraSiete= "herir";

        boolean comparacion3= palabraCuatro.compareTo(palabraCinco)==0;
        boolean comparacion4= palabraCinco.compareTo(palabraCuatro)==0;
        boolean comparacion5= palabraSeis.compareTo(palabraUno)==0;

        System.out.printf("la comparacion es %b %n",comparacion3);
        System.out.printf("la comparacion es %b %n",comparacion4);
        System.out.printf("la comparacion es %b %n",comparacion5);



    }
}
