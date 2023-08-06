package Mypackg;

public class pairing {
	public static int pair(int n) {
		if(n==1 || n==2) {
			return n;
		}
		return pair(n-1)+ n-1 * pair(n-2); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4;
System.out.println(pair(n));
	}

}
