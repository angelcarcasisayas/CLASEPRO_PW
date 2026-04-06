package ejercicios.clases;

public class Herencia {
    public static void main(String[] args){

          // Herencia
        var animal = new Animal("Angela");
       // animal.name= "mi perrita ";
        animal.eat();

        var dog = new Dog("Linko", 23);
       // dog.name= "Linko";
        dog.eat();
        var cat = new Cat("Foguis");
       // cat.name= "Foguis";
        cat.eat();
        var bird = new Bird("El paaajaro");
       // bird.name= "Louis";
        bird.eat();
        bird.fly();


    }

    public static class Animal {

        String name;


        //SI PONGO UN CONSTRUCTOR EN LA SUPER CLASE QUE ES ANIMAL
        //LAS SUBCLASES QUE HEREDAN TIENEN QUE TENER CONSTRUCTOR
        public Animal(String name){
            this.name=name;
        }

        public void eat(){
            System.out.println("El animal con nombre "+name+" esta comiendo");
        }
    }

        //CON EL "EXTENDS" PUEDES HEREDAR METODOS DE UNA CLASE PADRE A HIJA
         //DOG ES HIJO DE ANIMAL Y PUEDE HACER OS METODOS DE UN ANIMAL
    public static class Dog extends Animal{
        int age;
            public Dog(String name, int age) {
                super(name);
                this.age= age;

                // Aqui no se puede poner this.name=name
                //tenemos que llamar a super para que cumpla el constructor de la clase padre
            }

            public void eat() {
            System.out.println("El perro con nombre "+name+" esta comiendo");

        }
    }
    public static class Cat extends Animal{

        public Cat(String name) {
            super(name);
        }
    }
    public static class Bird extends Animal{
        public Bird(String name) {
            super(name);
        }

        public void fly(){
            System.out.println("El pajaro "+name+" vuela");
        }
    }
}
