package objects;

public class Runner {

    public static void main(String[] args) {

        BankAccount b =  new BankAccount("Bob", 100000);
        b.makeTransaction(1300);
        b.makeDeposit(10000);
        System.out.println(b.getBalance());

        //Rectangle r = new Rectangle(5, 1);
        //System.out.println(r.getArea());

        /*
        Point p = new Point();
        Point other = new Point();
        p.x = 5.0;
        p.y = 0;
        other.x = -7.0;
        other.y = -200;

        p.printCoordinates();*/
    }
}
