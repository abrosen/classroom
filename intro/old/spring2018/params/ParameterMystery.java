package params;

public class ParameterMystery {
    public static void main(String[] args) {
        int x = 9;
        int y = 2;
        int z = 5;

        mystery(z, y, x);

        mystery(y, x, z);
    }



    public static void mystery(int x, int z, int y) {
    	System.out.println(x);
    	System.out.println(z);
    	System.out.println(y);
    	
        System.out.println(z + " and " + (y - x));
    }
}
