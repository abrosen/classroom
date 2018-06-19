package methods;

public class HowToWriteMethods {


    // let's write a method to calculate distance



    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        double ans = Math.sqrt(dx + dy);
        //System.out.println("dx: "+dx);
        //System.out.println("dy: "+dy);
        //System.out.println("ans: " + ans);
        return ans;
    }


    public static void printTable(int rows){
        for (int i = 1; i <=rows ; i++) {
            printRow(i);

        }

    }

    public static void printRow(int n) {
        int i = 1;
        while (i <= 6) {
            System.out.printf("%4d",  n*i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //System.err.println("You can print out your own errors!");
        //printTable(10);


    }


}
