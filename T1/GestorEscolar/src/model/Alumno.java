package model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Alumno {

    private Asignatura asigna1, asigna2, asigna3; //Se usa asi para conectar las clases de Asignatura
    //con la de Alumno ya que un alumno puede tener muchas asignaturas

    public Alumno(Asignatura asigna1, Asignatura asigna2, Asignatura asigna3) {

        this.asigna1 = asigna1;
        this.asigna2 = asigna2;
        this.asigna3 = asigna3;
    }
    //Estos 2 constructores sirve para lo mismo pero funcinan de diferente manera
    //Es decir los 2 crean asignaturas pero en el de arriba le das los nombre de las asignaturas
    //y las de abajo las creas mediante un id en este caso un int es decir un numero.
    public Alumno(int id1, int id2, int id3){
        this.asigna1 = new Asignatura(id1);
        this.asigna2 = new Asignatura(id2);
        this.asigna3 = new Asignatura(id3);
        //Lo que aparece en el main, esos parametros
        //El contructor cogera el 1 y inicializara una Asignatura con id1
        //cogera el 2 y inicalizara una Asignatura con id2
    }
    public void mostrarDatos(){
        System.out.println("Imprimiendo los datos del alumno");
        asigna1.mostrarDatos();
        asigna2.mostrarDatos();
        asigna3.mostrarDatos();
    }

}
