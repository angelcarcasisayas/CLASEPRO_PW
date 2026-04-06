import model.Alumno;
import model.Asignatura;
import model.Profesor;

public class Main {
    public static void main(String[] args){

        Asignatura programacion= new Asignatura(1);

        // id=0; calificacion = 0,0;

        Asignatura sistemas= new Asignatura(2);

        Asignatura entornos= new Asignatura(3);

        Asignatura baseDatos= new Asignatura();

        Asignatura fundamentos= new Asignatura();

        sistemas.mostrarDatos();

        Alumno maria =new Alumno(programacion,sistemas,entornos);
        Alumno carlos =new Alumno(programacion,sistemas,entornos);
        //tienen en comun las tres asignaturas
        maria.getAsigna1().getCalificacion();
        Alumno garcia = new Alumno(1,2,3);
        // el 1 no tiene nada que ver con el id1 de arriba
        //lo de arriba son espacios en memoria y es solo un hueco
        //y lo de abajo es otra cosa
        //para crear un Alumno tu le escribes como lo tiene maria pero en el caso
        // de garcia le das los identificadores y el internamente crea las asignaturas

        System.out.println("comprobamos cuales son las notas de los alumnos");
        System.out.println("de maria");
        maria.mostrarDatos();
        System.out.println("de carlos");
        carlos.mostrarDatos();
        Profesor profesor = new Profesor();
        //Instancias un profesor
        System.out.println("procedemos a poner notas");
        profesor.ponerNotas(maria);
        profesor.ponerNotas(carlos);

        System.out.println("comprobamos la notas despues de ponerlas");
        System.out.println("de maria");
        maria.mostrarDatos();
        System.out.println("de carlos");
        carlos.mostrarDatos();

        System.out.println("La media de maria es "+profesor.calcularMedia(maria));
        System.out.println("La media de carlos es " +profesor.calcularMedia(carlos));


    }
}
