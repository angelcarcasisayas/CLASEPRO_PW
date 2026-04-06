package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Profesor {
    //No tiene atributos -> el construcor default esta implicito

    public void ponerNotas(Alumno alumno){
        alumno.getAsigna1().setCalificacion((Math.random()*10)+0.1);
        //eliges un alumno en la clase main y coges la asigna1 y le pones su nota
        alumno.getAsigna2().setCalificacion((Math.random()*10)+0.1);
        //eliges un alumno en la clase main y coges la asigna2 y le pones su nota
        alumno.getAsigna3().setCalificacion((Math.random()*10)+0.1);

    }
    public double calcularMedia(Alumno alumno){
        // Tu me das un alumno recogo sus calificaciones de sus asignaturas
        double media = alumno.getAsigna1().getCalificacion() +
                alumno.getAsigna2().getCalificacion() +
                alumno.getAsigna3().getCalificacion();
        //y lo retorno dividido entre 3
        return (media)/3;
    }
}
