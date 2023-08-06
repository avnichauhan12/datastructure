package Mypackg;

import java.util.ArrayList;

//package tree;

public class BST{
	public static class Node{
		int data;
		Node left;
		Node right;
		
		
		Node(int data){
			
			this.data=data;
		}
	}
	
	public static void inorder(Node root) {
		if(root == null) {
			return ;
			
		}
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	public static Node delete(Node root,int val) {
		if(root.data<val) {
			root.right=delete(root.right,val);
		}
		else if(root.data>val) {
			root.left=delete(root.left,val);
		}
		else {
			// case-1 leaf node
			if(root.left==null && root.right==null) {
				return null;
			}
			//case-2 single child
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			//case -3 two child
			Node is=findinorder(root.right);
			root.data=is.data;
			root.right=delete(root.right,is.data);
		}
		return root;
	}
	//path to leaf node
	public static void path(Node root,ArrayList<Integer> a) {
		if(root==null) {
			return;
		}
		a.add(root.data);
		if(root.left==null && root.right==null) {
			//System.out.println(root.data);
			printpath(a);
		}
		path(root.left,a);
		path(root.right,a);
		a.remove(a.size()-1);
		
		
	}
	//range
	public static void range(Node root,int k1,int k2) {
		if(root==null) {
			return;
		}
		if(root.data>=k1 && root.data<=k2) {
			range(root.left,k1,k2);
			System.out.print(root.data);
			range(root.right,k1,k2);
		}
		else if(root.data > k1) {
			range(root.left,k1,k2);
			//System.out.println(root.data);
		}
		else {
			range(root.right,k1,k2);
			//System.out.println(root.data);
		}
	}
	public static Node findinorder(Node root) {
		while(root.left!=null) {
			root=root.left;
		}
		return root;
	}	

	public static Node insert(Node root,int val) {
		if(root ==null) {
			root = new Node(val);
			return root;
		}		
		if(root.data>val) {
			
			root.left = insert(root.left,val);
			
		}	
		else {
			root.right = insert(root.right,val);
		}
			return root;
	}
	public static void printpath(ArrayList<Integer> a) {
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i));
			//a.remove(a.get(i));
		}
		System.out.println(" ");
	}
	public static boolean valid(Node root,Node max,Node min) {
		if(root==null) {
			return;
		}
		if(root.data)
	}
	public static void main(String[] args) {
		int value[]= {5,1,3,4,2,7};
		Node root = null;
		//delete(root,4);
		
		for(int i =0;i<value.length;i++) {
			root = insert(root,value[i]);
		}
		//delete(root,4);
		//inorder(root);
		//range(root,2,4);
		ArrayList<Integer> a=new ArrayList<>();
		path(root,a);

	}	
}
