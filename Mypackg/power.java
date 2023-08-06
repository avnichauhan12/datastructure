package Mypackg;

public class power {
	public static int calpower(int x,int n) {
		if(n==0) {
			return 1;
		}
		return x*calpower(x,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int x=4;
		System.out.println(calpower(x,n));

	}

}
