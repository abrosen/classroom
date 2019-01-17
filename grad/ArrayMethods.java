public class ArrayMethods {

    public static double average(int[] arr) {
        double  total =  sum(arr);
        System.out.println(total);
        int size  = arr.length;
        return total/size;
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }


    public static boolean containsEven(int[] arr) {
        for(int i = 0; i < arr.length ; i++) {
            int value  = arr[i];
            if(value % 2 == 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsAllEvens(int[] arr) {
        for (int  x :  arr) {
            if( x % 2 != 0 ) {
                return  false;
            }
        }


        return true;
    }

    // ["hello", "world"]
    public static int countChars(String[] words) {
        int sum =0;
        for(int i =0; i< words.length; i++) {
            String word  = words[i];

            sum += word.length();
        }

        return sum;
    }

    public static int countLetters(String[] words){
        int sum = 0;
        for(int i = 0; i < words.length; i++){
            String word =  words[i];
            for(int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if(Character.isLetter(c)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr =  new int[10000000];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]  = 3*i ;
        }

        String[] words  = {"hi", "this is a ", "boring string!"};

        System.out.println(countChars(words));
        System.out.println(countLetters(words));
    }
}
