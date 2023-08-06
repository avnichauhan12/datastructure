package Mypackg;

public class butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=8-2*i;k++) {
				System.out.print(" ");
			}
			for(int h=1;h<=i;h++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		/////// half butterfly ///////
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=8-2*i;k++) {
				System.out.print(" ");
			}
			for(int h=1;h<=i;h++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}
