package objects;

public class BankAccount {
    private String user;
    private double balance;


    public BankAccount(String user, double balance) {
        this.balance = balance;
        this.user = user;
    }


    public double getBalance(){
        return balance;
    }

    public void makeTransaction(double amount){
        this.balance -= amount;
    }

    public void makeDeposit(double amount) {
        this.balance += amount;
    }

}
