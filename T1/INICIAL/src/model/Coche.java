package model;


//TODA CLASE EXTIENDE OBJECT

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Coche {
    //tengo la funcionalidad que me ha dado la clase object

    private String marca, modelo, color;

    private int numeroPuertas, cv, precio;

    //tipo_acceso tipo_retorno nombre_metodos (argumentos){cuerpo metodo}
    //tipo_acceso nombre_metodo (argumentos){cuerpo metodo} -> no le digo que retorna
    //CONSTRUCTORES -> minimo tengo 1, el vacio esta por defecto(implicito) solo si no hay uno ya escrito (enmascara)

    public Coche(){}

    public Coche(String marca,String modelo, int cv, int precio ){

        this.marca= marca;
        this.modelo= modelo;
        this.cv=cv;
        this.precio=precio;
    }
    public Coche(String marca, int numeroPuertas, String modelo, int precio) {
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.modelo = modelo;
        this.precio = precio;

    }
    //Metodo Getter
    public int getPrecio(){
        return precio;
    }

    //Metodo Setter
    public void setPrecio(int precio){
        //Le aplico logica
        this.precio= precio;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}
