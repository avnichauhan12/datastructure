package Mypackg;

public class sumArray {

	public static void subArray(int arr[]) {
		int n,sum=0;
		int max_sum=Integer.MIN_VALUE;
		n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				sum=0;
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
					sum=sum+arr[k];
				}
				System.out.println();
				System.out.println("sum is:"+ sum);
		       if(sum>max_sum) {
		    	   max_sum=sum;
		       }
				
			}
			System.out.println();
		}
		System.out.println("maximun sum is :"+max_sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,-2,6,-1,3};
		subArray(arr);
		

	}
}
