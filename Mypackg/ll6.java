package Mypackg;
import java.util.Scanner;
public class ll6 {
	
		
		public static class Node{
			int data;
			Node next;
			
			
			Node(int data){
				this.data =data;
				this.next=null;
				
				
			}
			
		}

		 public static Node head = null;
		 public static Node tail =null;
		
		public static void insert(int data) {
			
			Node a = new Node(data);
			
			if (head ==null) {
				head=a;
				tail=a;
			}
			else {
				tail.next=a;
				tail=a;
				
			}
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			for(int i=1;i<=5;i++) {
				int c = sc.nextInt();

				insert(c);
			}
		//	insert(43);
		//	insert(565);

			Node temp =head;
			for(int i=1;i<=5;i++) {
				System.out.print(temp.data+" ");
				temp=temp.next;

			}

		}

	}
