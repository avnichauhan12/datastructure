package Mypackg;

public class subarray {
	public static void subArray(int arr[]) {
		int n;
		n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
				
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,7,8,5};
		subArray(arr);
		

	}

}
