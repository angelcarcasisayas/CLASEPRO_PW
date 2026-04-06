package ejercicios.ClasesExercize;

public class Student {

    String name;
    int score;


    public  void aprobado(){

        if(score >=60){
            System.out.println("El alumno "+name+" esta aprobado");

        } else {
            System.out.println("El puto alumno "+ name+" desaprobo JAJAJAJA");
        }
    }
}
