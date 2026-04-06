package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Colegio {

    private ArrayList<Alumno> alumnos=new ArrayList<>();
    private Profesor profesor;

    public Colegio(){
        alumnos =new ArrayList<>();
    }
    public Colegio(Profesor profesor){
        this.profesor= profesor;

    }
    public void matricularAlumno(Alumno alumno){
        this.alumnos.add(alumno);
        //Esto mete el alumno a la lista del colegio
        System.out.println("Matriculado correctamente");
    }
    public void calificarAlumnos(){
        System.out.println("Procedemos a calificar");
        for (Alumno alumno: alumnos ) {
            profesor.ponerNotas(alumno);
        }
    }

    public void mostrarResultados(){
        System.out.println("Vamos a ver la media de los alumnos");
        double mediaTotal=0;
        //Recorre toda la lista de alumnos sacate un alumno en cada vuelta
        for (Alumno alumno: alumnos){
            double mediaAlumno= profesor.calcularMedia(alumno);
            System.out.println("La media del alumno es"+ mediaAlumno);
            mediaTotal+=mediaAlumno;
        }
        System.out.println("La nota media total de los alumnos es de "+mediaTotal/alumnos.size());
    }
}
