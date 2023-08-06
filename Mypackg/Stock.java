package Mypackg;
import java.util.*;
public class Stock {
	public static void profit(int price[]) {
		int profit=0;
		int bp = price[0];
		int arr[]=new int[price.length];

		for(int i=1;i<price.length;i++) {
			//int bp = price[0];

			profit=price[i]-bp;
			arr[i]=profit;
			bp= Math.min(price[i], bp);
			
			
		}
		Arrays.sort(arr);
		System.out.print(arr[price.length-1]);
	}

	public static void main(String[] args) {
		int price[]= {7,1,5,3,6,4};
		
		profit(price);
	}


}
