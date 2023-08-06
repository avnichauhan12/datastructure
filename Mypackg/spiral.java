package Mypackg;

public class spiral {
	public static void diagonalsum(int arr[][]) {
		// left digonal
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==j) {
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println(sum);
		// right diagonal
		int s=0;
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++) {
				s=s+arr[i][j];
				j=j-1;

		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		diagonalsum(arr);

	}

}
