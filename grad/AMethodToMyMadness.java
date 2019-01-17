public class AMethodToMyMadness {

    public static void printHello(){
        System.out.println("Hi, I'm from a method!");
    }


    public static void printFive(String word) {
        for(int i = 0; i < 5; i++){
            System.out.println(word);
        }
    }

    public static int add(int x, int y){
        int sum = 0;
        x  = 999;
        sum = x + y;
        return sum;
    }


    public static void main(String[] args) {
        printFive("Hello");
        printHello();
        int a = 3;
        int b = 7;
        int sum = add(a,b);
        System.out.println(a);
    }
}
