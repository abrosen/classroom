public class AccountTester {


    public static void main(String[] args) {

        BankAccount bobAccount =  new BankAccount("Bob", 100 );
        bobAccount.depositCheck(50);
        bobAccount.withdrawFunds(10);

        double amount = bobAccount.getBalance();
        amount+=100;
        System.out.println(bobAccount.getBalance());

    }
}
