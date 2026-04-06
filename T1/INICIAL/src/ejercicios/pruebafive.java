package ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class pruebafive {
    public void main() {

        /*final int EDAD= 21;
        var GA= "calla mierda";
        String nombre= "Angel";
        int edad= 21;
        double altura= 1.75 ;
        boolean gusto= true;
        final String email = "angel.benjamin@gmail.com";
        char inicial= 'a';
        String localidad= "Granollers";
        localidad="Canovelles";
        int a= 14;
        int b= 31;
        int suma= b+a;
        int años;
        System.out.println("My nombre es "+nombre+" y mi edad es "+edad+ " tambien mido "+ altura );
        System.out.println("Me gusta programar es "+ gusto);
        System.out.println("mi gmail es "+email);
        System.out.println("mi inicial es "+inicial);
        System.out.println("mi localidad es "+ localidad);
        System.out.println("La suma es " + suma);
        años= 21;
        System.out.println("La española tiene "+ años +" años");

         */

       /*
        double a = 123;
       double b = 21;
       int c = 54;
       int d = 31;
        System.out.println("la suma es "+ (a+b+c+d));
        System.out.println(a/b);
        a= b;
        System.out.println(a);
        a= b*2;
        //comparaciones racionales
        System.out.println(a);
        System.out.println(a>c);
        System.out.println(a<d);
        System.out.println(c==b);
        System.out.println(b!=c);
        //operadores logicos si una es correcta y la otra = false
        // si las dos son correctas el resultado es true
        System.out.println(true && true);
        System.out.println(true&& false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(5<10 && 6==3);
        // O (OR)
        // si todas son falsas es false pero si hay una verdadera es true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(5<10 || 6==3);

        // NO (NOT) negacion
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5<10) || !(6==6) );

        //Unarios
        System.out.println(++c); // esto incrementa y imprime 1
        System.out.println(c++); //esto imprime y luego incrementa 1
        System.out.println(c);
        System.out.println(--c);

        */

       /*
        int a=2;
        int b=6;
        int c=5;
        int suma= a+b+c;
        System.out.println(suma);
        a+=10;
        System.out.println(a);
        b*=19;
        System.out.println(b);
        c-=1;
        System.out.println(c);
        System.out.println(a<b && b>c && c<a);
        System.out.println(a>b && b<c && c>a);
        System.out.println(!(a<b) && !(b>c) || !(c>a));


        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
        a=10;
        b=15;
        c=5;
        int d=7;
        System.out.println(a<b && b+a > a+c );

        */

       /*
        String name= "Angel";
     String nombre="ANGEL";
     //longitud
        System.out.println(name.length());
        //obtener caracter
        System.out.println(name.charAt(4));
        //es lo mismo para obtener el ultimo caracter
        System.out.println(name.charAt(name.length() - 1));

        //subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,3));
        //mayusculas y minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //comprobar si contiene

        System.out.println("hola, java".contains("Angel"));
        System.out.println("hola, java".contains("ja"));
        System.out.println("hola, java".toUpperCase().contains("JA"));
        System.out.println("HOLA, JAVA".toLowerCase().contains("ja"));

        //comparacion
        System.out.println(name.equals("Angel"));
        System.out.println(name.equalsIgnoreCase("angel"));
        System.out.println(name.equalsIgnoreCase(nombre));

        //Trim
        System.out.println("  Hola Mundo Cruel ".trim());

        //Replace
        System.out.println("Hola Mundo Cruel".replace("Cruel","Fiel"));

        //Format
        int age=21;
        System.out.println(String.format("hola mi nombre es %s y tengo %d", name,age ));

        */
        /*
        String PalabraUno= "lomo";
        String PalabraDos= "pollaso";
        String PalabraTres= "Cerdo";
        System.out.println(String.format("Me gusta el %s, %s y el %s",PalabraTres, PalabraDos, PalabraUno));

        System.out.println(PalabraUno.length());
        System.out.println(PalabraUno.charAt(0));
        System.out.println(PalabraUno.charAt(3));
        System.out.println(PalabraDos.toLowerCase());
        System.out.println(PalabraUno.toUpperCase());
        System.out.println("Calla cochadetumare".contains("calla"));
        int edad= 21;
        String clave= String.format("Tengo %d de edad",edad);
        System.out.println("Hola me llamo Angel y "+ clave);
        System.out.println("  Hola que tal todo bien ".trim());
        System.out.println(PalabraUno.replace("lomo","que paso compa"));
        System.out.println("Hola que fa de la vita eres doctor".replace("doctor","ingeniero"));
        System.out.println(PalabraUno.equalsIgnoreCase(PalabraDos));
        var largoUno= PalabraUno.length();
        var largoDos= PalabraDos.length();
        /*if (PalabraUno.length()==PalabraDos.length()){
            System.out.println("Son iguales");

        } else {
            System.out.println("Son diferentes");
        }


        System.out.println(largoUno == largoDos);

         */
        /*
        int edad= 18;

        if(edad>=18){
            System.out.println("Si es mayor de edad");
        } else{
            System.out.println("Es menor de edad");
        }
        int day=2;

        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("No es lunes, martes o miercoles");


        }

         */

        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.println("Cuantos años tienes?");
        edad = lector.nextInt();

        if (edad >= 18) {
            System.out.println("Puede votar");

        } else {
            System.out.println("No puede votar");
        }

        int numero1 = 5;
        int numero2 = 7;
        if(numero1>numero2){
            System.out.println("El numero 1 es mayor que el 2");
        } else if (numero2>numero1) {
            System.out.println("El numero 2 es mayor que el 1");

        }else{
            System.out.println("El numero 1 y 2 son iguales");
        }
        int number;
        System.out.println("Dime un numero");
        number=lector.nextInt();

        if (number<0){
            System.out.println("El numero es negativo");
        } else if (number>0) {
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es 0");
        }

        int nume;
        System.out.println("Escribe un numero");
        nume=lector.nextInt();
        if(nume%2==0){
            System.out.println("Es un numero par");

        }else {
            System.out.println("Es impar");
        }

        int dia;
        System.out.println("Dime el dia de la semana");
        dia=lector.nextInt();
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No pusiste ningun dia de la semana");
                break;

        }
        int edades;
        boolean acampañado;
        String respuesta;
        System.out.println("Que edad tienes?");
        edades=lector.nextInt();
        lector.nextLine();
        System.out.println("Vas acompañado?");
        respuesta=lector.nextLine();
        acampañado=respuesta.equals("s");

        if(edades>=15 || acampañado ){
            System.out.println("Puedes entrar ");
        }else {
            System.out.println("no puedes entrar");
        }

    }

}
