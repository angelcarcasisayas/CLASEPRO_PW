package ejercicios.ClasesExercize;

public class Book {
    //Atributos
    String title ;
    String autor;


    //constructor
    public Book(String title, String autor){
        this.title=title;
        this.autor=autor;

    }
    //Metodos

    public void mostrarDatos(){
        System.out.println("El titulo es "+ title+" y el autor es "+autor);

    }
}
