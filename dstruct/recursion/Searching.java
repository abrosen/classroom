package recursion;

public class Searching {




    // [5 2 1 3 8 6 4 ...]

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i <  arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;

    }



    public static <E extends Comparable<E>> int binarySearch(E[] arr, E target){
        return binarySearch(arr, target, 0,arr.length-1);
    }


    // [1 3 5 6 7 8 9 100 101] target is 7
    private static <E extends Comparable<E>> int binarySearch(E[] arr, E target, int start, int end){
        if(end < start){
            return -1;
        }
        int middle = (start + end) / 2;
        if(arr[middle].compareTo(target)  == 0){
            return middle;
        } else if(target.compareTo(arr[middle])  < 0){
            return binarySearch(arr,target, start, middle - 1);
        } else {
            return binarySearch(arr, target , middle +1 ,end);
        }

    }


    public static void main(String[] args) {
        Integer[] arr = new Integer[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  =  2*i;
        }
        System.out.println(binarySearch(arr, 1000));

    }

}
