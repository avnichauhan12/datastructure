package Mypackg;
import java.util.*;

public class stackqueue {
	public static class queue{
		static Queue<Integer> q1=new LinkedList<>();
		static Queue<Integer> q2=new LinkedList<>();
		public static boolean isEmpty() {
			return q1.isEmpty() && q2.isEmpty();
		}
		public static void add(int data) {
			if(!q1.isEmpty()) {
				q1.add(data);
			}
			else {
				q2.add(data);
			}
		}
		public static int pop() {
			if(isEmpty()) {
				System.out.println("empty");
				return -1;
			}
			int top=-1;
			if(!q1.isEmpty()) {
				while(!q1.isEmpty()) {
					top=q1.remove();
					if(q1.isEmpty()) {
						break;
					}
					q2.add(top);
				}
			}
			else {
				while(!q2.isEmpty()) {
					top=q2.remove();
					if(q2.isEmpty()) {
						break;
					}
					q1.add(top);
				}
				
			}
			return top;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q=new queue();
		q.add(3);

		q.add(6);
		q.add(6);
		System.out.println(q.pop());
	}

}
