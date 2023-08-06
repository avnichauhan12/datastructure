package Mypackg;

public class Binary {
	public static int binarysearch(int arr[],int key) {
		int start=0;
		int mid;
		int end=arr.length-1;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(arr[mid]<key){
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int arr[] = {2,5,7,34,67,89,90};
		int key=89;
		System.out.println("index is :"+binarysearch(arr,key));
	}

}
