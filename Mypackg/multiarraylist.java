package Mypackg;
import java.util.*;
public class multiarraylist {
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(7);
		mainList.add(list);
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(20);
		list1.add(50);
		list1.add(70);
		mainList.add(list1);
		System.out.println(mainList);
		for(int i=0;i<mainList.size();i++) {
			ArrayList<Integer> curr=mainList.get(i);
			for(int j=0;j<curr.size();j++) {
				System.out.println(curr.get(j));
			}
			}
	}

}
