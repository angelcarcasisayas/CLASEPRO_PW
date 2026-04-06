package ejercicios;

import java.util.Scanner;
public class pruebatwo {
    public void main(String[] args){
        Scanner lector= new Scanner(System.in);

        System.out.println("Dime tu edad");
        int edad= lector.nextInt();
        System.out.println("Dime el dia de la semana");
        int dia= lector.nextInt();
        int entradas = 0;

        if (edad <12){
            entradas=0;
        } else if (edad <17) {
            if( dia ==2){
                entradas=0;
            } else{
                entradas=5;
            }
        } else if (edad<64) {
            if(dia ==4){
                entradas=7;
            }else{
                entradas=10;
            }
        } else{
            entradas=6;
        }
        String diaSemana= "";
        if (dia==1){
            diaSemana="Lunes";
        } else if (dia==2) {
            diaSemana="Martes";
        } else if (dia==3) {
            diaSemana="Miercoles";
        } else if (dia==4) {
            diaSemana="Jueves";

        } else if (dia==5) {
            diaSemana="Viernes";
        }else if (dia == 6) {
            diaSemana = "Sabado";
        } else if (dia == 7) {
            diaSemana = "Domingo";
        }
        System.out.println("La edad para la entrada indicada es "+entradas +" para el dia "+diaSemana);
    }
}
