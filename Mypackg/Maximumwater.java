package Mypackg;
import java.util.*;

public class Maximumwater {
	public static void storewater(ArrayList<Integer> height) {
		int maxwat=0;
		int l=height.size();
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				int ht=Math.min(height.get(i),height.get(j));
				int width=j-i;
				int currentwater=ht*width;
				maxwat=Math.max(maxwat,currentwater);
				
			}
		}
		System.out.println(maxwat);
	}
	public static void main(String args[]) {
		ArrayList<Integer> height=new ArrayList<>();
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);
		storewater(height);
		
	}

}
