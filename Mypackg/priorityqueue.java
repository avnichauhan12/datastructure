package Mypackg;

import java.util.PriorityQueue;

public class priorityqueue {

	//private static final String PriorityQueue = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(1);
		pq.add(20);
		pq.add(5);
		pq.add(3);
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.remove();
		}
	}

}
