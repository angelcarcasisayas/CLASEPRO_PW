package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class proba5 {
    public void main(){
        Scanner Lector=new Scanner(System.in);
        var nombres= new ArrayList<String>();
        var names= new HashSet<String>();
        var numbers= new HashMap<String, Integer>();

        nombres.add("Angel");
        nombres.add("Karen");
        nombres.add("Simba");
        nombres.add("koala");
        nombres.add("cinturon");

        names.add("Mandaloriano");
        names.add("Katariano");
        names.add("superitado");

        numbers.put("Komida", 2);
        numbers.put("Simbolos", 4);
        numbers.put("Gorilas", 6);

        System.out.println(nombres);
        System.out.println(names);
        System.out.println(numbers);

    }
}
