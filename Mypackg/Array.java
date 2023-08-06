package Mypackg;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		int index=0;
		System.out.println("enter size of an array");
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=ob.nextInt();
		}
		System.out.println("element to be searched");
		int m=ob.nextInt();
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==m) {
				index=j;
			}
		}
		if(index==m) {
		
			System.out.println("index is"+index);

	     }
		else {
			System.out.println("not found");
			
		}
	}		

}
