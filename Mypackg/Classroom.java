package Mypackg;
import java.util.ArrayList;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array List
		ArrayList<Integer> list=new ArrayList<>();
		//Add element in to an list
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(9);
		list.add(6);
		System.out.println(list);
		
		//get element
		int a=list.get(2);
		System.out.println(a);
		//delete operation
		list.remove(1);
		System.out.println(list);
		//set
		list.set(2,12);
		System.out.println(list);
		// contains
		System.out.println(list.contains(3));
		// size of an array list
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("//////////////reverse number");
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
		

	}

}
