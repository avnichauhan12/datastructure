package Mypackg;

import java.util.*;

public class chocolaproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,m=6;
		Integer costver[]= {2,1,3,1,4};
		Integer costhor[]= {4,1,2};
		Arrays.sort(costver,Collections.reverseOrder());
		Arrays.sort(costhor,Collections.reverseOrder());
		int h=0,v=0;
		int hp=1,vp=1;
		int cost=0;
		while(h< costhor.length && v<costver.length) {
			if(costver[v]<= costhor[h]) {//horizontal cost
			cost+=(costhor[h]*vp);
			hp=hp+1;
			h+=1;
				
			}
			else {
				cost+=(costver[v]*hp);
				vp=vp+1;
				v+=1;
			}
		}
		while(h< costhor.length) {
			cost+=(costhor[h]*vp);
			hp=hp+1;
			h+=1;
		}
		while(v< costver.length) {
			cost+=(costver[v]*hp);
			vp=vp+1;
			v+=1;
		}
		
		System.out.println(cost);
		
		

	}

}
