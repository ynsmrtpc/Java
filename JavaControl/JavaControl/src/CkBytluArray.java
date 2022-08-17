
public class CkBytluArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1,3,5,7,9}, {2,4,6,8,10}};
		
		System.out.print(arr[0][0]);
		System.out.print(arr[1][0]);
		System.out.print(arr[0][1]);
		System.out.print(arr[1][1]);
		System.out.print(arr[0][2]);
		System.out.print(arr[1][2]);
		System.out.print(arr[0][3]);
		System.out.print(arr[1][3]);
		System.out.print(arr[0][4]);
		System.out.print(arr[1][4]);	
		
		System.out.print("\n**********************\n");
		
		for(int i=0 ; i<2; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.print(arr[i][j]);
			}
		}
	}
}
