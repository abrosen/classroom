public class WaitASecond {
    public static void main(String[] args) {
        System.out.println("hello");
        long end =  System.currentTimeMillis() +1000;
        while(System.currentTimeMillis() < end){

        }
        System.out.println("world");

    }
}
