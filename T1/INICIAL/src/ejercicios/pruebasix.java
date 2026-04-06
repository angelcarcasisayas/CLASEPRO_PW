package ejercicios;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class pruebasix {
    public void main(){
        //declaracion y creacion
        /*int[] numbers = new int[3];

        String[] names= {"Angel","Benhamin","Joaquin"};

        //Acceso
        System.out.println(numbers[0]);
        System.out.println(names[1]);

        System.out.println((new String[3])[0]);

        //Modificacion
        numbers [0] = 2;
        numbers [1] = 3;
        numbers [2] = 1;
        names [2]="Luis";
        System.out.println(names[2]);
        names [2]= null;
        System.out.println(names[2]);

         */

        /*
        //ArrayList
        //  Declaracion y creacion
        ArrayList<String> names = new ArrayList<String>();
        //Otra forma de hacerlo
        var numbers =new ArrayList<Integer>();

        //Tamaño

        System.out.println(names.size());

        //Añadir elementos

        names.add("Angel");
        names.add("Benja");
        names.add("Luis");
        System.out.println(names.size());

        //Acceder a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        //Modificar elementos

        names.set(2,"Caracortada");
        System.out.println(names.getLast());

        //Eliminar

        names.remove(2);
        //System.out.println(names.get(2)); Ya no existe

        //Buscar elementos

        System.out.println(names.contains("Angel"));

        //Limpiar ArrayList

        names.clear();
        System.out.println(names.size());

         */
        String[] nombres ={"Angel", "Vionda", "Carlos", "Kiara"};
        var names= new ArrayList<>(Arrays.asList(nombres));
        names.add("Cecilio");
        names.add("Cirio");
        System.out.println(names);
        System.out.println(names.get(3));

        var prodigy= new HashSet<>(names);

        prodigy.add("Krilin");
        System.out.println(prodigy);

        var mapa= new HashMap<String, String>();
        for(var elemento: prodigy){
            mapa.put(elemento, elemento);

        }
        System.out.println(mapa);



    }
}
