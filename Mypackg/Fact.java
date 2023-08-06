package Mypackg;

import java.util.Scanner;

public class Fact {
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		factorial(n-1);
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ob=new Scanner(System.in);
int n=ob.nextInt();
int c=factorial(n);
System.out.println(c);
	}

}
