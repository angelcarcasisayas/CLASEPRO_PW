package ejercicios;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class proba {
    public void main(){

        System.out.println();
        String[] names={"Angel","Karen","Gonzalo","Pierina","Camilo","Gabriela"};

        int index=1;
        while(index<=10){
            System.out.println(index);
            index++;
        }

        var numbers= new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        do {
            System.out.println(numbers);
        }while (0>1);

        int i =5;
        for (i=5;i<=50;i+=5){
            System.out.println(i);
        }

        int suma=0;
        int y=0;
        do{
            suma+= numbers.get(y);
            y++;
        }while(y<numbers.size());

        System.out.println(suma);

        var ninis= new HashMap<Integer, String>();
        ninis.put( 2,"Comandos");
        ninis.put( 3, "Guerrilleros");
        ninis.put( 4,"Gerentes");
        ninis.put( 5, "Periodistas");

        var nonos= new HashSet<String>();
        nonos.add("Caracortada");
        nonos.add("Heisenberg");
        nonos.add("Soprano");
        nonos.add("Shellby");
        nonos.add("Padrino");


        System.out.println("Las personas mas importantes de nuestro equipo son" + ninis);

        for ( var cosas: ninis.entrySet() ){
            System.out.println(cosas);
        }

    }

}
