package Mypackg;

public class pallindrompattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			int a=i;
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(a);
				a=a-1;
				
			}
			for(int j=1;j<i;j++) {
	
				System.out.print(a+2);
				a=a+1;
			}
			System.out.println("");
		}

	}

}
