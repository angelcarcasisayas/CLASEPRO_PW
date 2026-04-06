package ejercicios;

import java.util.Scanner;
import java.util.prefs.NodeChangeListener;

public class pruebatree {
    public void main(String[] args){
        Scanner lector= new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre= lector.nextLine();
        System.out.println("Introduce la nota");
        int nota= lector.nextInt();
        switch (nota){
            case 1:

                System.out.println("Has reprobado con honores");
                break;

            case 5:

                System.out.println("Has aprobado raspando");
                break;
            case 8:

                System.out.println("Has aprobado con buena calificacion");
                break;
            case 10:

                System.out.println("Has sido el mejor");
                break;
            default:
                System.out.println("Esta nota no es analizable");
                break;

        }
        System.out.println("hola "+ nombre+" tu nota es "+nota);
    }
}
