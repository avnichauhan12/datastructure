package Mypackg;

import java.util.Arrays;
import java.util.Comparator;

public class maxlenpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pairs[][]= {{5,24},{39,60},{5,28},{27,40},{50,90}};
		Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
		int chainlen=1;
		int chainend=pairs[0][1];
		for(int i=1;i<pairs.length;i++) {
			if(pairs[i][0]>chainend) {
				chainlen+=1;
				chainend=pairs[i][1];
			}
		}
		System.out.println(chainlen);
		

	}

}
