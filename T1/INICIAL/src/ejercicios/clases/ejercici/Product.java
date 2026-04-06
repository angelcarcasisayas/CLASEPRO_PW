package ejercicios.clases.ejercici;

public class Product {

    private double price;

    public Product(double price){
        this.setPrice(price);
    }


    public double getPrice(){
        return price;
    }

    public void setPrice(double price){

        if(price > 0){
            this.price= price;
            System.out.println("Es un precio admitido : "+price);
        }else {
            System.out.println("el precion no esta admitido");
        }
    }
}
