public class GradeDistribution {
    private int A;
    private int B;
    private int C;
    private int D;
    private int F;

    public GradeDistribution() {
        A = 0;
        B = 0;
        C = 0;
        D = 0;
        F = 0;
    }

    public void setA(int a) {
        A = a;
    }

    public void setB(int b) {
        B = b;
    }

    public void setC(int c) {
        C = c;
    }

    public void setD(int d) {
        D = d;
    }

    public void setF(int f) {
        F = f;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }

    public int getD() {
        return D;
    }

    public int getF() {
        return F;
    }

    public int numGrades(){
        return A+B+C+D+F;
    }

    public int percentA() {
        return 100*A/numGrades();
    }
    public int percentB() {
        return 100*B/numGrades();
    }
    public int percentC() {
        return 100*C/numGrades();
    }
    public int percentD() {
        return 100*D/numGrades();
    }
    public int percentF() {
        return 100*F/numGrades();
    }


    public void drawGraph() {
        System.out.println("0    10   20   30   40   50   60   70   80   90   100%");
        System.out.println("|    |    |    |    |    |    |    |    |    |    |");
        System.out.println("***************************************************");
        System.out.print(  "*");
        for (int i = 0; i < percentA()/2; i++) {
            System.out.print("*");
        }
        System.out.println(" A");

        System.out.print(  "*");
        for (int i = 0; i < percentB()/2; i++) {
            System.out.print("*");
        }
        System.out.println(" B");

        System.out.print(  "*");
        for (int i = 0; i < percentC()/2; i++) {
            System.out.print("*");
        }
        System.out.println(" C");

        System.out.print(  "*");
        for (int i = 0; i < percentD()/2; i++) {
            System.out.print("*");
        }
        System.out.println(" D");

        System.out.print(  "*");
        for (int i = 0; i < percentF()/2; i++) {
            System.out.print("*");
        }
        System.out.println(" F");
    }

    public static void main(String[] args) {
        GradeDistribution dist = new GradeDistribution();
        dist.setA(30);
        dist.setB(30);
        dist.setC(10);
        dist.setD(10);
        dist.setF(20);
        System.out.println(dist.getA());
        System.out.println(dist.numGrades());
        System.out.println(dist.percentA());
        dist.drawGraph();

    }
}
