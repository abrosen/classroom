package inheritance;

public class ForEachExample {

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6,8,3};

        int sum = 0;
        for(int value : arr){
            sum += value;
        }
        System.out.println(sum);

    }
}
