package Mypackg;
import java.util.Scanner;

public class MaxArray {
	public static int Maxarray(int arr[]) {
		int max=Integer.MIN_VALUE; // or max=Integer.MIN_VALUE
		for(int j=0;j<arr.length;j++) {
			if(max<=arr[j]) {
				max=arr[j];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println("enter an size of an array");
	    int n;
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<n;i++) {
			arr[i]=ob.nextInt();
		}
		int Max=Maxarray(arr);
		System.out.println("maximum element is :"+Max);
		
	}

}
