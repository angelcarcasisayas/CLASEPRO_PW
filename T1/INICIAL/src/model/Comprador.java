package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Comprador {

    private String nombre, apellido, direccion, correo;
    private int telefono;

    public Comprador(String nombre, String apellido, String direccion, String correo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    //Constructores
    //Getter y Setter

}
