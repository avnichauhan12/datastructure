package Mypackg;

public class mergesort {
	public static void printarr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void mergeSot(int arr[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		mergeSot(arr,si,mid);
		mergeSot(arr,mid+1,ei);
		merge(arr,si,ei,mid);
		
	}
	public static void merge(int arr[],int si,int ei int mid)
		int temp=new temp[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<mid+1 && j<ei+1{
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;
				k++;
			}
			else {
				temp[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
			
		}
		while(j<=ei) {
			temp[k++]=arr[j++];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {6,9,3,5,2,1};
      printarr(arr);
      mergeSot(arr,0,arr.length-1);
	}

}
