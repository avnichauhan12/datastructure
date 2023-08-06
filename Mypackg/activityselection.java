package Mypackg;
import java.util.*;
public class activityselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start[]= {1,3,0,5,8,4};
		int end[]=   {2,4,6,7,9,9};
		 int maxac=0;
		 ArrayList<Integer> ans=new ArrayList<>();
		 maxac=1;
		 ans.add(0);
		 int last=end[0];
		 for(int i=1;i<end.length;i++) {
			 if(start[i]>=last) {
				 maxac=maxac+1;
				 ans.add(i);
				 last=end[i];
			 }
		 }
		 System.out.println("maxactivity"+maxac);
		 for(int i=0;i<ans.size();i++) {
			 System.out.println(ans.get(i));
		 }

	}

}
