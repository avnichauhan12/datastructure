package Mypackg;
import java.util.*;
public class difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {4,1,8,7};
		int B[]= {2,3,6,5};
		Arrays.sort(A);
		Arrays.sort(B);
		int diff=0;
		for(int i=0;i<A.length;i++) {
			diff=diff+Math.abs(A[i]-B[i]);
		}
		System.out.println("diff = "+diff);
		
		}

	}


