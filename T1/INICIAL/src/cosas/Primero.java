package cosas;

import java.util.Scanner;

public class Primero {
    public static void main(String[] args){
        Scanner Lector= new Scanner(System.in);
        String primero= "comida";
        String segundo= "bebida";
        String tercero= "postre";
        String cuarto= "menu ejecutivo";

        System.out.println("Que opcion elijes : comida, bebida, postre y menu ejecutivo");
        String opcion= Lector.nextLine();
        if (opcion.equals(primero)){
            System.out.println("Comeras lentejas");
        }
        else if (opcion.equals(segundo)) {
            System.out.println("Tomaras aguita");
        } else if (opcion.equals(tercero)) {
            System.out.println("Comeras un chesscake");
        } else if (opcion.equals(cuarto)) {
            System.out.println("Tendras un menu ejecutivo ");
            System.out.println("Ademas te regalamos un bocata");
        } else {
            System.out.println("opcion no reconocida");
        }
    }
}
