public class DataTypes {

    public static final double PI = 3.1415; // static variable - we'll cover these much later
                                            // also final - means it can't change (constant)

    private int size;                       // instance variable


    public static void main(String[] args) {
        // Java is strongly typed
        // to declare a variable
        // TYPE VAR_NAME;
        // only write the type when creating
        int x;

        // to assign a value to a variable
        // VAR_NAME = 5;
        // IMPORTANT: think of = like an arrow <-
        // The value on the right gets copied into the variable on the left
        x = 5;


        // Usually combined into a single statement
        int y = 6;


        System.out.println(x + y);




        // Types have two broad categories
        // primitives and Objects
        int i  = 7;
        double d  = 2.0;
        System.out.println( i / d );
        char c = 'a';
        System.out.println( (char) (c + 5));
        boolean b = i < d;

        System.out.println(b);

        // Utility/Wrapper Classes for primitives
        i  = Integer.MAX_VALUE;
        System.out.println(i+1);



    }
}
