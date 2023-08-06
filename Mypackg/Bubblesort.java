package Mypackg;

public class Bubblesort {
	public static void bubbSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int temp=arr[i];
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
			}
			
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,9,3,7,4,2,5};
		
		bubbSort(arr);
	}

}
