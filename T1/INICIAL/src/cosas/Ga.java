package cosas;

import java.util.Scanner;

public class Ga {
    public void main(){
        Scanner lector= new Scanner(System.in);
        int Primero;
        int Segundo;
        System.out.println("Escribe un numero del uno al 10");
        Primero= lector.nextInt();
        System.out.println("Escribe lo que falta para que sea tu edad");
        Segundo= lector.nextInt();

        int Suma= Primero + Segundo;
        System.out.println("Tienes de años "+Suma);

    }
}