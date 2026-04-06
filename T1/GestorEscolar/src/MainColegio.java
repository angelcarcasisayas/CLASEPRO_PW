import model.Alumno;
import model.Colegio;
import model.Profesor;

public class MainColegio {

    public static void main(String[]args){

        Profesor profesor = new Profesor();
        Colegio colegio = new Colegio(profesor);
        // el colegio tiene a alumnos=[],  y a un profesor = null inicialmente se queda asi
        //pero si queremos tener un profesor contratado ponemos el Colegio(profesor)
        // de momento hay 0 alumnos
        colegio.matricularAlumno(new Alumno(1,2,3));
        // ahora tengo un alumno
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));
        colegio.matricularAlumno(new Alumno(1,2,3));

        colegio.calificarAlumnos();
        colegio.mostrarResultados();

    }
}
