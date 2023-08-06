package Mypackg;

public class FirstOccurence {
	public static int Occurences(int arr[],int i) {
		int key=6;
		if(i==arr.length-1) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
             
		}
		return Occurences(arr,i+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,3,8,6,3};
		System.out.println("first occurences is :"+Occurences(arr,0));
	}

}
