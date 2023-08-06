package Mypackg;
import java.lang.*;
import java.util.Scanner;

public class Mudball {
	public static int findFloor(int n, int m) {
	    int low = 1;
	    int high = n;
	    while (low <= high) {
	        int mid = (low + high) / 2;
	        if (dropBall(mid, m)) {
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    return high;
	}

		public static boolean dropBall(int floor, int m) {
		    
			if (floor <= 0 || floor > m) {
		        throw new IllegalArgumentException("Invalid floor: " + floor);
		    }
		    return floor >= Math.ceil(Math.sqrt(m));

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the  floors number");
		int n;
		n=ob.nextInt();
		System.out.println("Enter the mud balls");
		int m=ob.nextInt();
		int notbreak = findFloor(n,m);
		boolean floor =dropBall(notbreak,m);
		System.out.println("no of moves" + floor);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
