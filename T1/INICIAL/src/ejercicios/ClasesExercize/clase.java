package ejercicios.ClasesExercize;

public class clase {
    public static void main(String[] args){

        var book = new Book("The outsider", "Stephen King");

        book.mostrarDatos();

        var book2 = new Book("El principito", "El bro");

        book2.mostrarDatos();

        var dog = new Dog("woff");

        dog.imprimirSonido();

        var car =new Car();
        car.brand = "Toyota";
        car.model = "X624";

        car.showData();

        var student= new Student();

        student.name= "Angel";
        student.score= 61;

        student.aprobado();

        var banckAccount= new BanckAccount();



        banckAccount.deposit(4000);
        banckAccount.deposit(400);


    }
}
