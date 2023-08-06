package Mypackg;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		swapfun(a,b);
			}

	public static void swapfun(int x,int y){
	int temp;
	temp=x;
	x=y;
	y=temp;
	System.out.println(x);
	System.out.println(y);
		
	}
}
