package ejercicios.clases;

import java.util.ArrayList;

public class Classes {
    public static void main(String[]args){

        //Esto es hacer una instancia
        //el person se puede usar como un objeto cuando
        // instanciamos la classe Person();
         var person = new Person("Angel", -34, "32719912391");

         person.name = "Angel";
         //person.age= 21;

         person.sayHello();

        // person.id ="123348912";

         person.name = "Benjamin";

         person.setAge(35);
        System.out.println(person.getAge());

        System.out.println(person.name);

        var person2 = new Person("Benjamin", 24, "300028804");
        person2.sayHello();

        var person3= new Person("Jado", 29, "312321414");
        person3.sayHello();
        ArrayList<Person> listas= new ArrayList<>();


        for(Person humano: listas){
            System.out.println(humano);
        }

    }
}
