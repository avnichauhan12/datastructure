package Mypackg;

public class midll {
	public static class node{
		int data;
		node next;
		node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static node head=null;
	public static node tail=null;
	public static void add(int data) {
		node a=new node(data);
		if(head==null) {
			head=a;
			tail=a;
		}
		else {
			tail.next=a;
			tail=a;
		}
	}
	public static int reverse(node head) {
		node curr=head;
		node pre=null;
		while(curr!=null) {
			node a=curr.next;
			curr.next=pre;
			pre=curr;
			curr=a;
			//temp=temp.next;
		}
		return pre.data;
	}
	//public static node start=null;
	//public static node last=null;
	public static node mid(node head) {
		node start=head;
		node last=head;
		while(last!=null && last.next!=null) {
			start=start.next;
			last=last.next.next;
		}
		return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(4);
		add(3);
		add(2);
		add(7);
		add(10);
		node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		node middle=mid(head);
		System.out.println(middle);
		System.out.println(reverse(head));

	}

}
