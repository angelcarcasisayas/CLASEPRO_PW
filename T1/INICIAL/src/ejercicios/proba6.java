package ejercicios;

public class proba6 {
    public static void main (String[] args){

        for (int i=0; i<3;i++){
            wealcomeJava();
        }

        wealcomeJava();
        wealcomeJava("Angel");
        numerosResta(6,2);

        cuadrado(92);
        parImpar(26);

    }
    public static void wealcomeJava(){
        System.out.println("Te doy la bienvenida al curso de Java desde cero");
    }

    public static void wealcomeJava(String name ){
        System.out.println("Hola "+ name + " que pasa crack");
    }

    public static void numerosResta(int number, int number2 ){

        int resta = number-number2;

        System.out.println("La resta es "+ resta);

    }

    public static void cuadrado(int a){
        int resultado= (a * a);

        System.out.println("El cuadrado de "+ a + " es "+ resultado );

    }
    public static void parImpar(int a) {


        if (  a % 2 ==0) {
            System.out.println(a+ " Es par");

        } else {
            System.out.println(a+ " es impar");
        }

    }
}
