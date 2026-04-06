package cosas;

import java.util.Scanner;

public class Tareaa {
    public void sumar(){
        Scanner Lector = new Scanner(System.in);
        System.out.println("Numero Entero");
        int num1= Lector.nextInt();
        System.out.println("Numero Entero");
        int num2= Lector.nextInt();

        int suma= num1+num2;
        int resta= num1-num2;
        int multi= num1*num2;
        int divi= num1/num2;
        int restoEntero= num1%num2;
        double diviReal= (double) num1/num2;
        double restoReal= num1 - ((int)(num1 / num2) * num2);

        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: " +multi);
        System.out.println("la division es :" +divi);
        System.out.println("el resto entero es: "+restoEntero);
        System.out.println("la division real es: "+diviReal);
        System.out.println("el resto real es: "+restoReal);





    }



}
