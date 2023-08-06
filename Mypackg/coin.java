package Mypackg;

import java.util.Arrays;

public class coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int curr[]= {1,2,5,10,20,50,100,500,2000};
		//Arrays.sort(curr);
		int count=0;
		int amount=96;
		for(int i=curr.length-1;i>=0;i--) {
			if(curr[i]<=amount) {
				while(curr[i]<=amount) {
					count=count+1;
					amount=amount-curr[i];
				}
			}
		}
		System.out.println(count);
		

	}

}
