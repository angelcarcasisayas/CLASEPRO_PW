package ejercicios.clases.ejercici;

import cosas.Pro;

public class classs {

    public static void main(String[]args){

        var persona = new Persona("Angel", 25);

        persona.setAges(34);
        System.out.println(persona.getAges());

        var product = new Product(65);
        product.setPrice(3232);
        System.out.println(product.getPrice());

        var bankAccount= new BankAccount(500);

        bankAccount.deposit(727);
        bankAccount.withdraw(300);

        var book= new Book("La carceria");
        book.getTitle();
        System.out.println(book.getTitle());

        var temperature = new Temperature(23.3);
        temperature.setCelsius(120);
        System.out.println(temperature.getCelcius());

        var user= new User("ananay", "angel123");
        var user1 = new User("jajaja", "angel123");

        user.checkPassword(user1);

        System.out.println(user.checkPassword(user1));

        var employee= new Employee(2192);
        employee.raiseSalary(400);
        System.out.println(employee.getSalary());

    }
}
