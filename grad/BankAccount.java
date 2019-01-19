public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void depositCheck(double checkAmount) {
        this.balance += checkAmount;

    }

    public void withdrawFunds(double amount){
        this.balance -= amount;

    }

    public double getBalance(){
        return balance;
    }
}
