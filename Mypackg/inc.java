package Mypackg;

import java.util.Scanner;

public class inc {
	public static void increasing(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		increasing(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		//System.out.println(increasing(n));
		increasing(n);
	}

}
