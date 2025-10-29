import java.util.Scanner;

public class Ejercicio {

private Scanner lectorTeclado;


    public void ejercicio1(){
        lectorTeclado = new Scanner(System.in);
        System.out.println("Cuantas bebidas vas a comprar");
        int bebidas = lectorTeclado.nextInt();
        System.out.println("Cuantos bocatas vas a comprar");
        int bocatas = lectorTeclado.nextInt();
        System.out.println("Cuanto vale cada bebida");
        double bebida = lectorTeclado.nextDouble();
        System.out.println("Cuanto vale cada bocata");
        double bocata = lectorTeclado.nextDouble();
        System.out.println("Cuantas personas han realizado la compra");
        int personas = lectorTeclado.nextInt();


        double costeBebidas = bebidas*bebida;
        double costeBocatas = bocatas*bocata;
        double costeTotal = costeBocatas+costeBebidas;
        double costePersona = costeTotal/personas;


        System.out.println("Precio total de bocatas es:" + costeBocatas);
        System.out.println("Precio total de bebidas es:" + costeBebidas);
        System.out.println("Precio total de la compra es:" +costeTotal);
        System.out.println("Precio total por persona es:" + costePersona);

        lectorTeclado.close();

    }

}
