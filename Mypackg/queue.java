package Mypackg;

public class queue {
	public static class Queue{
		static int arr[n];
		static int size;
		static int rear;
		public Queue(int n){
			arr=new int[n];
			size=n;
			rear=-1;
		}
	}
	public static boolean isEmpty() {
		return rear=-1;
	}
	public static void add(int data) {
		if(rear==size-1) {
			System.out.println("queue is full");
			return;
		}
		rear=rear+1;
		arr[rear]=data;
	}
	public static int remove() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1
		}
		int front=arr[0];
		for(int i=0;i<rear;i++) {
			arr[i]=arr[i+1];
			rear=rear-1;
		}
		return front;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue q=new Queue(5);
q.add(6);
q.add(5);
q.add(9);
	}

}
