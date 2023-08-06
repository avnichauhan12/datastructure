package Mypackg;

public class bubbles {
	public static void selection(int arr[]) {
		int n=arr.length;
		int min=0;
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n-1;j++) {
				if(arr[j]<arr[i]) {
				    temp=arr[i];
					arr[i]=arr[j];
					arr[j]=arr[i];
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,1,3,2};
        selection(arr);
	}

}
