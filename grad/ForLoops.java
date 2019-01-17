public class ForLoops {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 10000; i++) {
            if(i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);


        //             0123456789012345678901
        String text = "Much Ado About Nothing";
        for(int i = text.length() - 1 ; i >= 0; i-- ) {
            System.out.println(text.charAt(i));
        }

    }

}
