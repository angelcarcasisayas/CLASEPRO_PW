package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class proba4 {
    public void main(){
        var cineTop = new ArrayList<String>();
        Scanner Lector= new Scanner(System.in);

        System.out.println("GESTOR DE TUS PELICULAS FAVORITAS");

        while(true){
            System.out.println("OPCIONES");
            System.out.println("1. Agregar peliculas");
            System.out.println("2. Ver lista");
            System.out.println("3. Eliminar pelicula");
            System.out.println("4. Salir");
            System.out.print("\nElige opción: ");
            String opcion= Lector.nextLine();

            switch(opcion){
                case "1":
                    System.out.println("Nombre de la pelicula: ");
                    String pelicula = Lector.nextLine().trim();
                    if(pelicula.isEmpty()){
                        System.out.print("\nEscribe una pelicula");
                    }else {
                        cineTop.add(pelicula);
                        System.out.println("pelicula agregada\n");
                    }
                    break;
                case "2":
                    if(cineTop.isEmpty()){
                        System.out.println("\nLa lista esta vacia");
                    }else {
                        System.out.println("\n TUS PELICULAS FAVORITAS\n");
                        for( int i=0; i< cineTop.size();i++){
                            System.out.println((i+1)+". "+ cineTop.get(i));
                        }
                        System.out.println("\nTotal:"+ cineTop.size()+ "\n");
                    }
                    break;
                case "3":
                    if(cineTop.isEmpty()){
                        System.out.println("No hay peliculas para eliminar\n");
                    } else {
                        System.out.println("Elige una pelicula\n");
                        for(int i=0; i<cineTop.size();i++){
                            System.out.println((i+1)+ ". "+ cineTop.get(i));
                        }
                        System.out.println("¿Cual numero quieres eliminar?");
                        try {
                            int indice = Integer.parseInt(Lector.nextLine())-1;
                            if(indice >= 0 && indice < cineTop.size()){
                                String eliminada = cineTop.remove(indice);
                                System.out.println("✓ Eliminada: " + eliminada + "\n");
                            } else {
                                System.out.println("⚠ Número inválido\n");
                            }

                        } catch (NumberFormatException e){
                            System.out.println("Debes de escribir otro numero\n");
                        }
                    }
                    break;
                case "4":
                    System.out.println("Hasta luego");
                    Lector.close();

                default:
                    System.out.println("Opcion invalida");
            }

        }
    }
}
