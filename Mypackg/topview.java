package Mypackg;

import Mypackg.subtree.node;
import java.util.*;	
public class topview {
	public static class node{
		int data;
		node left;
		node right;
		int hd;
		public node(int data,int hd) {
			this.data=data;
			this.left=null;
			this.right=null;
			this.hd=hd;
		}
	}
	public static void topview(node root) {
		Queue<node> q= new LinkedList<>();
		Hash
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node root=new node(1,0);
		root.left=new node(2,-1);
		root.right=new node(3,1);
	     root.left.left=new node(4,-2);
		root.left.right=new node(5,0);
		root.right.left=new node(6,2);
		root.right.right=new node(7,0);


	}

}
