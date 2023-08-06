package Mypackg;
import java.util.Scanner;

public class Sumrec {
	public static int sumRecurrssion(int n) {
		if(n==1) {
			return 1;
		}
		sumRecurrssion(n-1);
		return n+sumRecurrssion(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int sum=sumRecurrssion(n);
		System.out.println(sum);
		

	}

}
