package model;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter

public class Asignatura {
    private int id;
    private double calificacion;

    // constructor por defecto -> queda enmascarado cuando he escrito explicitamente un constructor

    public Asignatura(int id){
        //Mediante un numero que seria el int id puedes crear una Asignatura lo que seria la variable Asignatura
        this.id=id;

    }
    public Asignatura(){

    }

    public void mostrarDatos(){
        System.out.println("Mostrando datos de la asignatura requerida");
        System.out.println("id= "+id);
        System.out.println("calificacion = " + calificacion);
    }


}
