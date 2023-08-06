package Mypackg;
import java.util.*;

public class queuestack {
	public static class queue{
		static Stack<Integer> s1 =new Stack<>();
		static Stack<Integer> s2 =new Stack<>();
		
		public static void add(int data) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(data);
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			
		}
		public static void remove() {
			if(s1.isEmpty()) {
				System.out.println("empty");
				return;
			}
			else {
				System.out.println(s1.pop());
			}
		}
		
	}
	public static void main(String args[]) {
		queue q=new queue();
		q.add(5);
		q.remove();
		q.remove();
	}

}
