package ejercicios;

import java.util.Scanner;

public class pruebaone {
    public void main(String[] args){
        Scanner lector= new Scanner(System.in);
        System.out.println("Introducir contraseña");
        String pass = lector.next();
        boolean nMinimo= pass.length() >=8;
        boolean nMaximo= pass.length() <=16;
        System.out.println("La contraseña tiene almenos 8 digitos "+nMinimo);
        System.out.println("La contraseña tiene menos de 17 digitos "+nMaximo);
        boolean esValida= (pass.equals("12345678") || pass.equals("password"));
        System.out.println("La contraseña es invalida " +esValida);
        boolean cNumero= pass.contains("1") || pass.contains("2") || pass.contains("3") || pass.contains("4") ||
                pass.contains("5") || pass.contains("6") || pass.contains("7") || pass.contains("8") ||
                pass.contains("9");
        System.out.println("La contraseña contiene numeros " +cNumero);
        boolean passValida= nMaximo && nMinimo && esValida && cNumero;
        System.out.println("La contraseña es valida: "+passValida);

    }
}
