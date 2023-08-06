package Mypackg;

import java.util.Arrays;
import java.util.*;

public class knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value[]= {120,100,60};
		int weight[]= {30,20,10};
		int W=50;
		int ratio[]=new int[weight.length];
		for(int i=0;i<weight.length;i++) {
			ratio[i]=value[i]/weight[i];
		}
		int arr[][]=new int[weight.length][2];
		for(int j=0;j<arr.length;j++) {
			arr[j][0]=j;
			arr[j][1]=ratio[j];
		}
		Arrays.sort(arr,Comparator.comparingDouble(o ->o[1]));
		double c=W;
		double val=0;
		for(int i=arr.length-1;i>=0;i--) {
			int indx=arr[i][0];
			if(c>=weight[indx]) {
				c=c-weight[indx];
				val=val+value[indx];
			}
			else {
				val=val+(arr[i][1]*c);
				break;
			}
		}
		System.out.println(val);

	}

}
