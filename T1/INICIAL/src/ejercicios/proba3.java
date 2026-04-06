package ejercicios;
import java.util.Scanner;
import java.util.ArrayList;

public class proba3 {
    public void main(){
        var peliTop = new ArrayList<String>();
        Scanner Lector = new Scanner(System.in);

        System.out.println("=== GESTOR DE PELÍCULAS FAVORITAS ===\n");

        while(true){
            System.out.println("Opciones:");
            System.out.println("1. Agregar película");
            System.out.println("2. Ver lista");
            System.out.println("3. Eliminar película");
            System.out.println("4. Salir");
            System.out.print("\nElige opción: ");

            String opcion = Lector.nextLine().trim();

            switch(opcion){
                case "1":
                    System.out.print("Nombre de la película: ");
                    String pelicula = Lector.nextLine().trim();

                    if(!pelicula.isEmpty()){
                        if(peliTop.contains(pelicula)){
                            System.out.println("⚠ Ya existe en la lista\n");
                        } else {
                            peliTop.add(pelicula);
                            System.out.println("✓ Agregada\n");
                        }
                    } else {
                        System.out.println("⚠ No puede estar vacío\n");
                    }
                    break;

                case "2":
                    if(peliTop.isEmpty()){
                        System.out.println("\n📋 La lista está vacía\n");
                    } else {
                        System.out.println("\n=== TUS PELÍCULAS ===");
                        for(int i = 0; i < peliTop.size(); i++){
                            System.out.println((i + 1) + ". " + peliTop.get(i));
                        }
                        System.out.println("Total: " + peliTop.size() + "\n");
                    }
                    break;

                case "3":
                    if(peliTop.isEmpty()){
                        System.out.println("\n⚠ No hay películas para eliminar\n");
                    } else {
                        System.out.println("\n=== PELÍCULAS ===");
                        for(int i = 0; i < peliTop.size(); i++){
                            System.out.println((i + 1) + ". " + peliTop.get(i));
                        }
                        System.out.print("\n¿Cuál eliminar? (número): ");
                        try {
                            int indice = Integer.parseInt(Lector.nextLine()) - 1;
                            if(indice >= 0 && indice < peliTop.size()){
                                String eliminada = peliTop.remove(indice);
                                System.out.println("✓ Eliminada: " + eliminada + "\n");
                            } else {
                                System.out.println("⚠ Número inválido\n");
                            }
                        } catch(NumberFormatException e){
                            System.out.println("⚠ Debes escribir un número\n");
                        }
                    }
                    break;

                case "4":
                    System.out.println("\n¡Hasta luego!");
                    Lector.close();
                    return;

                default:
                    System.out.println("⚠ Opción inválida\n");
            }
        }
    }
}
