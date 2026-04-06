package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class proba2 {
    public void main(){
        var peliTop= new ArrayList<String>();
        Scanner Lector= new Scanner(System.in);

        String pelicula;

        while(true){
            System.out.println("Escribe tus peliculas favoritas o escribe fin");
            pelicula= Lector.nextLine();
            if(pelicula.equalsIgnoreCase("fin")){
                break;
            }
            if(pelicula.isEmpty()){
                System.out.println("No dejar vacios, completalo");
                continue;
            }
            peliTop.add(pelicula);
            System.out.println("✓ Agregada");
        }
        if(peliTop.isEmpty()){
            System.out.println("No tienes ninguna pelicula");
        }else{
            System.out.println("TUS "+peliTop.size()+ " PELICULAS FAVORITAS");
            for (int i=0; i<peliTop.size(); i++){
                System.out.println((i+1)+ ". "+peliTop.get(i));
            }

        }
        Lector.close();

    }

}
