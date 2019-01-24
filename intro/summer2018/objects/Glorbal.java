package objects;

import java.util.Arrays;

public class Glorbal {
    int lx[];
    public void twiddle(int xl){
        for(int larg = lx.length - 1 ; larg >= 0; larg-- ){
            lx[larg] = lx[larg] + xl - larg;
        }
    }
    public static void main(String[] args) {
        Glorbal kl = new Glorbal();
        int[] a = {1,2,3};
        kl.lx = a;
        kl.twiddle(3);
        System.out.println(Arrays.toString(a));
    }
}