public class ExamQuestions {
    // range(5) -> {0,1,2,3,4}
    // range(1) -> {0}
    public static int[] range(int n) {
        int[] d =  new int [n];
        for(int i =0; i<n;i++){
            d[i] = i;
        }

        return d;
    }


    //unOrUn: If the given String begins with “un”, return a String with without the “un” in front.
    //Otherwise, return the String with “un” added to the front of it. You may assume the String is at least
    //3 characters long.
    // unOrUn("untied") -> "tied"
// unOrUn("unable") -> "able"
// unOrUn("necessary") -> "unnecessary"
    public String unOrUn(String str) {
        if (str.substring(0,2).equals("un")){
            return str.substring(2);

        }else{
            return "un"+str;
        }
    }

    // hasWildcat("tarmac") -> false
    // hasWildcat("kitty") -> false
    // hasWildcat("tomcat") -> true
    // hasWildcat("c4tn1P") -> true
    public boolean hasWildcat(String str) { // A-- would not buy again
        int l = str.length();
        for(int i =0; i< l-2;i++){
            if(str.charAt(i)=='c' && str.charAt(i+2)=='t') {
                return true;
            }
        }
        return false;
    }

    public int minMaxDifference(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i]< min){
                min = arr[i];
            }

        }
        return max-min;
    }


    // [1,2,3,4,5] -> [5,2,3,4,1]
    // [15,31,21,17,28] -> [28,31,21,17,15]
    // [-1,-100,12,2,100] -> [100,-100,12,2,-1]
    public void swapEnds(int[] arr) {
        int temp = arr[0];
        arr[0]  = arr[arr.length-1];
        arr[arr.length-1] = 0;
    }


    // "hello" -> "llo"
    // "a" -> "a"
    // "I’ve got a bad feeling about this" -> "his"
    public String lastThreeChars(String s) {
        if(s.length() <3){
            return s;
        }

        return s.substring(s.length() - 3);
    }

    public int sum2D(int[][] A) {
        int sum =0;
        for (int[] row : A){
            for(int num : row){
                sum += num;
            }
        }


        //for(int rowNum =0; rowNum < A.length; rowNum++) {
        //   for (int colNum = 0; colNum < A[rowNum].length ; colNum++) {
        //        sum += A[rowNum][colNum];
        //    }
        //
        //
        //}
        return sum;
    }

    public int[][] bigger2D(int[][] A, int[][] B) {
        if(sum2D(A) > sum2D(B)){
            return A;
        } else{
            return B;
        }
    }


    public boolean everywhere(int[] arr, int val) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            int left = arr[i];
            int right = arr[i+1];
            if( left != val && right != val  ) {
                return false;
            }

        }



        return true;
    }


}
