package Mypackg;

import java.util.*;

public class jobsequencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jobs[][]= {{4,20},{1,10},{1,40},{1,30}};
		Arrays.sort(jobs,Comparator.comparingDouble(o -> o[1]));
		int currTime=0;
		int val=0;
		int ans[]=new int[jobs.length];
		int b=0;
		for(int i=jobs.length-1;i>=0;i--) {
			if(jobs[i][0]>currTime) {
				ans[b]=i;
				currTime+=1;
				val+=jobs[i][1];
				b=b+1;
			}
		}
		System.out.println(val);
		for(int j=0;j<ans.length;j++) {
			int a=ans[j];
			if(a==0) {
				break;
			}
			System.out.println(jobs[a][0]+","+jobs[a][1]);
			}
		}
}
