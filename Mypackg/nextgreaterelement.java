package Mypackg;

import java.util.Stack;

public class nextgreaterelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,8,0,1,3};
		Stack<Integer> a= new Stack<>();
		int gre[]=new int[arr.length];
		int n=arr.length;
		gre[n-1]=-1;
		a.push(arr[n-1]);

		
		for(int i=n-2;i>=0;i--) {
		int curr=a.peek();
		while(!a.isEmpty() && curr<=arr[i]) {
			a.pop();
		}
		if(a.isEmpty()) {
			gre[i]=-1;
		}
		else {
		gre[i]=a.peek();
		}
		a.push(arr[i]);

	}
		for(int i=0;i<n;i++){
			System.out.println(gre[i]);
		}
			
		}

}
