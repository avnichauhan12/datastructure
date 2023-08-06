package Mypackg;

public class prefixsum {
	public static long maxSubarraySum(int[] arr) {
		// write your code here
		int prefix[]=new int[arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			prefix[i]=sum;
		}
		int maxsum=0;
		int currsum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(i==0){
					currsum=prefix[j];
				}
				else{
                 currsum=prefix[j]-prefix[i-1];
				}
				 if(currsum>maxsum){
					 maxsum=currsum;
				 }
			}
		}
		return maxsum;
	}
	public static void main(String args[]) {
		int arr[]= {10,20,-30,40,-50,60};
		System.out.println(maxSubarraySum(arr));
		
	}


}
