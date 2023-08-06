package Mypackg;

public class Reverse {
	public static void reverse(int arr[]) {
		System.out.println("original array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,7,5,34,45};
		reverse(arr);
		System.out.println("reverse array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
