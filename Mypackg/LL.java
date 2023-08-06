package Mypackg;

public class LL {
	public static class node{
		int data;
		node next;
		public node(int data) {
			this.data=data;
			this.next=null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node a=new node(3);
		node b=new node(4);
		node c=new node(5);
		node d=new node(6);
		node e=new node(7);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		node temp=a;
		for(int i=1;i<=5;i++) {
		
		System.out.println(temp.data);
		temp=temp.next;
		}

	}

}
