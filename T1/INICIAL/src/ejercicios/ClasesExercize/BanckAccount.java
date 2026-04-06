package ejercicios.ClasesExercize;

public class BanckAccount {
   int balance;


   public void deposit(int cantidad){

       balance= balance+cantidad;

       System.out.println("Tu saldo es de "+ balance);
   }
}
