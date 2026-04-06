package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class pruevaseven {
    public void main() {

        /*
        //Declaracion y creacion
        HashSet<String> names = new HashSet<String>();
        var numbers= new HashSet<Integer>();

        //Tamaño
        System.out.println(names.size());

        //Añadir Elementos
        names.add("Angel");
        names.add("Benja");
        names.add("Luis");
        System.out.println(names.size());

        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //Eliminar Elementos
        names.remove("Angel");
        System.out.println(names.size());

        //Buscar elementos
        System.out.println(names.contains("Angel"));
        System.out.println(names.contains("Luis"));

        //No permite repetidos
        names.add("Luis");
        names.add("Luis");
        names.add("Luis");
        System.out.println(names);

        //Conjuntos

        //names.addAll(numbers); ERROR POR INCOMPATIBILIDAD DE DATOS STRING CON INT pasa cuando intentas añadir un set de numeros a uno de letras

        var countries=new HashSet<String>();
        countries.add("Peru");
        countries.add("España");
        countries.add("Argentina");
        countries.add("Uruguay");

        names.addAll(countries);  FUNCIONA ESTA VEZ YA QUE LOS DOS SON STRINGS

        System.out.println(names); Aqui te pone los dos sets juntos los nombres y los paises


         */

        /*
        //MAPS
        //Declaracion y creacion
        var numbers = new HashMap<Integer, String>();
        var names = new HashMap<String,String>();

        //Tamaño
        System.out.println(names.size());

        //Añadir elementos

        names.put("Angel", "angel@gmail.com");
        names.put("Luis", "luis@gmail.com");
        names.put("Karen", "karen@gmail.com");
        names.put("Pedro", "pedro@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        //Acceder a los elementos

        System.out.println(names.get("Angel"));

        // Verificar elementos

        System.out.println(names.containsKey("Angel"));

        System.out.println(names.containsValue("karen@gmail.com"));

        //Eliminar elementos

        System.out.println(names.remove("Angel"));

        //Limpiar HashMap

        names.clear();
        System.out.println(names);

        //Otras operaciones

        names.put("Angel", "angel@gmail.com");
        System.out.println(names);

        names.put("Angel", "angelbenjamin@gmail.com");
        System.out.println(names);

        names.replace("Benjamin", "benjamin@gmail.com");
        System.out.println(names);

        names.putIfAbsent("Benjamin", "benjamin@gmail.com");
        System.out.println(names);

        System.out.println(names.isEmpty()); //para combrobar si esta vacio

        var values = names.values();
        System.out.println(values);

         */
       /*
        String[] nombres={"Angel", "Benja", "Andres", "Camilo", "Karlos"};
        System.out.println(nombres.length);
        nombres[2]= "Joaquin";
        System.out.println(nombres[2]);
        System.out.println(nombres[0]);

        var names= new HashMap<String, Integer>();

        names.put("Angel", 21);
        names.put("Benjamin", 25);
        System.out.println(names.size());
        names.put("Benjamin", 32);
        System.out.println(names);

        System.out.println(names.remove("Benjamin"));

        */

        /*
        //BUCLES

        //Loops

        //-for

        for (int i=0; i<4; i++){
            System.out.println("Hola");
        }

        //
        String[] name={"Angel", "Brandom", "Joker", "Cobra"};

        for(int i=0; i< name.length; i++){
            System.out.println(name[i]);
        }

        //For-each

        for (String names: name){
            System.out.println(names);
        }

        HashSet<Integer> numbers= new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        for(Integer numero: numbers){
            System.out.println(numero);
        }

        HashMap<String, String> palabra= new HashMap<>();

        palabra.put("Angel","Cobra");
        palabra.put("Benjamin","You");
        palabra.put("Mr","Robot");
        palabra.put("Zein","Cadaver");

        for(Map.Entry<String, String> pala: palabra.entrySet()){
            System.out.println(pala.getValue());
            System.out.println(pala.getKey());
        }

        //-While

        int index=0;
        while(index<5){
            System.out.println("hola");
            index++;

        }
        index=0;
        while(index < name.length){
            System.out.println(name[index]);
            index++;
        }
        index=0;
        while(index< name.length){
            System.out.println(name[index]);
            if (name[index]== "Joker"){
                index+=2;
            }
            index++;
        }

         */

        // do -while
        int index=0;
        do{
            System.out.println("Hola, Java");
            index++;
        } while (index <0);


    }
}
