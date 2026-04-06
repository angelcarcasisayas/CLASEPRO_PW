package ejercicios.clases.ejercici;

public class Employee {
    private double salary;

    public Employee(double salary){
        this.salary= salary;

    }

    public void raiseSalary(double percent){
        if(percent>0){
            salary += percent;
            System.out.println("El aumento de salario es de "+ percent);

        }
    }
    public double getSalary(){
        return salary;
    }
}
