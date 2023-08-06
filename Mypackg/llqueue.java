package Mypackg;

public class llqueue {
	public static class node{
		int data;
		node next;
		public node(int data) {
			this.data=data;
			this.next=null;
		}
		
	public static node head=null;
	public static node tail=null;
	public static void add(int data) {
		node a=new node(data);
		if(head==null) {
			head=a;
			tail=a;
			return;
		}
		else {
			tail.next=a;
			tail=a;
		}
	}
	public static boolean isEmpty() {
		return head==null & tail==null;
	}
	public static void remove() {
		if(isEmpty()) {
			System.out.println("empty list");
			return;
		}
		else {
			head=head.next;
		}
	}
	public static void main(String[] args) {
		add(4);
		add(5);
		add(6);
		remove();
		node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
		
	}

}
