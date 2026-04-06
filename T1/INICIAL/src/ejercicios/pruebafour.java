package ejercicios;

import java.util.Scanner;

public class pruebafour {
    public void main(){
        Scanner lector= new Scanner(System.in);
        //pide por teclado 10 numeros y di de todos ellos cuantos
        // son pares
        // son impares
        // el numero medio introducido
        int nPares= 0;
        int nImpares= 0;
        int sumatorio=0;
        for ( int i =0; i<5; i++) {
            System.out.println("Introduce un numero en posicion:" + i);
            int numero = lector.nextInt();
            if (numero % 2 == 0) {
                nPares++;
            } else {
                nImpares++;
            }
            sumatorio+=numero;
            if (numero==8){
                break;
            }

        }
        System.out.println("Los numeros pares son: "+nPares);
        System.out.println("Los numero impares son: "+nImpares);
        System.out.println("El sumatorio es: "+sumatorio);
    }

}
