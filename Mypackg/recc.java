package Mypackg;
import java.util.Scanner;

public class recc {
	public static void reccurssion(int n) {
		if(n>=1) {
			System.out.println(n);
			reccurssion(n-1);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reccurssion(n);
        
	}

}