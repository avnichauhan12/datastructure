package Mypackg;
import java.util.Scanner;

public class Fibo {
	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		fibonacci(n-1);
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the no of term");
		int n=ob.nextInt();
		int c=fibonacci(n);
		System.out.println(c);
		

	}

}
