package Mypackg;

import java.util.Stack;

public class pushatbottom {
	public static void add(Stack<Integer> ob,int data) {
		if(ob.isEmpty()) {
			ob.push(data);
			return;
		}
		int c=ob.pop();
		add(ob,data);
		ob.push(c);
		//add(ob,data);
		System.out.println(ob);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> ob=new Stack<>();
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		add(ob,5);
		//System.out.println(ob.peek());
		//System.out.println(ob);

	}

}
