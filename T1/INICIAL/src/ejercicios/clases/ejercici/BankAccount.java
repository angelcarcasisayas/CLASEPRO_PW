package ejercicios.clases.ejercici;

public class BankAccount {

    private int balance;

    public BankAccount(int balance){
        this.balance= balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+= amount;
            System.out.println("Tu deposito es de "+ amount);
            System.out.println("Tu saldo total es de "+ balance);
        }
    }
    public void withdraw(double amount){
        if (amount>0 && amount <=balance){
            balance-= amount;
            System.out.println("Tu retiro es de "+ amount);
            System.out.println("Tu saldo actual es de "+ amount);
        }

    }

}
