package methods;

public class HowToTrainYourLoops {

    public static void printInterwoven(){
        System.out.print("hello");
        System.out.println("world");
        System.out.print("!");
        System.out.println("!");
        System.out.print("done");
    }

    public static void loopExample(){
        //  initialization      loop condition     post operation
        for(   int i = 0     ; i < 5         ; i = i+2           ) {
            System.out.println("i is " + i);
            //System.out.println("!");
            //System.out.println("Loop code has ended, running update");
        }

        System.out.println();
    }




    public static void printSquares(){
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " squared is " + i*i);
        }

    }

    public static void printRows(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for( int j=0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDescendingRows(int numberOfRows){

        for (int i = numberOfRows; i >= 1; i--) {
            for(int j=0; j < i; j++){
                System.out.print("*");
            }
            for(int j = numberOfRows; j>i; j--){
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void printWordPieces(String word, int numberOfRows){
        // foobar
        // 012345
        if( numberOfRows > word.length()){
            numberOfRows = word.length();
        }

        for(int i = 1; i <= numberOfRows; i++){
            System.out.println(word.substring(0,i));
        }
    }

    public static void main(String[] args) {

        printWordPieces("foobar",10);
        //printRows(20);
        //printDescendingRows(10);

    }


}
