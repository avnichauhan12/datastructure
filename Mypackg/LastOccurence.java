package Mypackg;

public class LastOccurence {
	public static int Occurences(int arr[],int i) {
		int key=5;
		if(i==arr.length-1) {
			return -1;
		}
		return Occurences(arr,i+1);
		if(key==arr[i+1]) {
			return i;
		}
		//return Occurences(arr,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {2,5,4,8,3,5,9};
        System.out.println(Occurences(arr,0));
	}

}
