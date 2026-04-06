package ejercicios.clases;

public class Person {
    //Atributos
    protected String name;
    private int age;
    final private String id;

    // Constructor
    public Person(String name, int age, String id){
        this.name= "Nombre:" + name;
        this.setAge(age);
        this.id=id;

    }

    // Metodos
    public void sayHello(){
        System.out.println("Hola soy "+ name+ " y tengo "+age+ " años y mi id es "+id );
    }

    //Getter

    public int getAge(){

        return age;
    }


    public String getId() {
        return id;
    }
    //Setter
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("Edad no valida");
        }
    }
}
