package examReview;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {10, 11, 12, 13};
int[] brr= new int[4];

for(int i = 0; i <brr.length; i++){
	brr[i] = (i + 1) * 2;  
}

for(int i = 0; i < arr.length; i++) {
	arr[i] = arr[i] % brr[i];
}
System.out.println(Arrays.toString(arr));
	}

}
