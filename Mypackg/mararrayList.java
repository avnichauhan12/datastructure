package Mypackg;
import java.util.*;

public class mararrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 =new ArrayList<>();
		list1.add(5);
		list1.add(6);
		list1.add(10);
		list1.add(67);
		list1.add(43);
		list1.add(0);
		list1.add(2);
		// finding an maximum value
		/*int max=Integer.MIN_VALUE;
		for(int i=0;i<list1.size();i++) {
			if(max<list1.get(i)) {
				max=list1.get(i);
			}
		}
		System.out.println("maximun no is:"+max);*/
		// reverse an arraylist
		Scanner ob=new Scanner(System.in);
		int indx1=ob.nextInt();
		int indx2=ob.nextInt();
		int temp=list1.get(indx1);
		int a=list1.get(indx2);
		list1.set(indx1, list1.get(indx2));
		list1.set(indx2, temp);
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		//sorted array
		Collections.sort(list1);
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
	}
}