package cosas;

import java.util.Scanner;

public class Ejerp {
    private Scanner lectorTecla;
    public void ejer1(){
        lectorTecla= new Scanner(System.in);
        System.out.println("Cual es tu nombre completo");
        String nombre =lectorTecla.nextLine();
        System.out.println("Direccion de casa, portal, piso y letra del piso");
        String direccion = lectorTecla.nextLine();
        System.out.println("Codigo postal y provincia");
        String codigo=lectorTecla.nextLine();
        System.out.println("Pais");
        String pais= lectorTecla.nextLine();

        System.out.println( nombre);
        System.out.println( direccion );
        System.out.println( codigo );
        System.out.println(  pais );
    }

}
