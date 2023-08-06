package Mypackg;

public class zeroone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			int a=1,b=0;
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(b);

				}
				else {
					System.out.print(a);
				}
			}
			System.out.println("");
		}

	}

}
