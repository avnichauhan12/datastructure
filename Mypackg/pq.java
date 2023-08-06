package Mypackg;

import java.util.PriorityQueue;

public class pq { 
	// object in pq
	public static class student implements Comparable<student>{
		String name;
		int rank;
		student(String name,int rank){
			this.name=name;
			this.rank=rank;
		}
		@Override
		public int compareTo(student s2) {
			return this.rank-s2.rank;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<student> pq=new PriorityQueue<>();
		pq.add(new student("avni",1));
		pq.add(new student("b",80));
		pq.add(new student("n",76));
		pq.add(new student("d",14));
		pq.add(new student("i",11));
		pq.add(new student("r",34));
		while(!pq.isEmpty()) {
			System.out.println(pq.peek().name+"->"+pq.peek().rank);
			pq.remove();
		}
	}

}
