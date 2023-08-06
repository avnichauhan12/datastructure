package Mypackg;

public class Kadane {
	public static void maxsub(int arr[]) {
		int curr=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			curr=curr+arr[i];
			if(curr<0) {
				curr=0;
			}
			maxsum=Math.max(curr,maxsum);
		}
		System.out.println("max sum is ="+maxsum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		maxsub(arr);

	}

}
