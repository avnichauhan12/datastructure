
package Mypackg;

import java.util.Stack;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="avnii";
		Stack<Character> ob=new Stack<>();
		int indx=0;
		while(indx <str.length()) {
			ob.push(str.charAt(indx));
			indx=indx+1;
			
		}
		while(!ob.isEmpty()) {
			System.out.println(ob.pop());
		}

	}

}
