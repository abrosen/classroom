package tables;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[5];
		arr[0] = new int[2];
		arr[1] = {1,2,3,4,5};
		arr[2] = arr[0];
		arr[3] = {1};
        System.out.println(Arrays.deepToString(arr));

/*

		for(int i = 0; i<100; i++){




			if(i %5 == 0){
				continue;
			}
			System.out.println(i);
			
		}

	}
*/
}
