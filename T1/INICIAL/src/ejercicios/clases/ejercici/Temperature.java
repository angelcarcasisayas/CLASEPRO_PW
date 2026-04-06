package ejercicios.clases.ejercici;

public class Temperature {

    private double celsius;

    public Temperature(double celsius){
        this.setCelsius(celsius);
    }

    public void setCelsius(double celsius){
        this.celsius=celsius;
        if(celsius >=-100 && celsius<=100){
            System.out.println("Temperatura de "+ celsius +" aceptada");
        }else {
            System.out.println("Temperatura de "+ celsius +" no aceptada");
        }

    }
    public double getCelcius(){
        return celsius;
    }
}
