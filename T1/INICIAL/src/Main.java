import model.Coche;
import model.Comprador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void main(String[] args){
        Scanner Lector= new Scanner(System.in);
        var Lista= new ArrayList<String>();
        //Tipo de Dato nombreVariable =Valor
        Coche ford= new Coche("ford", "clase b", 200, 5000);
        // marca= null; modelo= null; color=null; numeroPuertas= 0; cv=0; precio=0;
        Coche mercedes= new Coche("mercedes","clase c", 300, 70000 );
        // marca= null; modelo= null; color=null; numeroPuertas= 0; cv=0; precio=0;
        Coche audi= new Coche();
        // marca= null; modelo= null; color=null; numeroPuertas= 0; cv=0; precio=0;
        Coche toyota= new Coche("toyota", 300, "clase r", 30000);
        //marca= null , numeroPuertas=0 , modelo= null , precio= 0,
        Comprador comprador= new Comprador("Angel", "Carcasi", "Calle los olivos", "angeñ@gmail.com", 613724582 );
        mercedes.setPrecio(100000);
        System.out.println("El precio del mercedes es de "+ mercedes.getPrecio());


    }

}
