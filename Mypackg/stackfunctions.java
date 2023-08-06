package Mypackg;
import java.util.*;

public class stackfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> ob=new Stack<>();
		ob.push(1);
		ob.push(2);
		ob.push(5);
		while(!ob.isEmpty()) {
			System.out.println(ob.pop());
		}

	}

}
