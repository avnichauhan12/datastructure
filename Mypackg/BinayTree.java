package Mypackg;

import java.util.*;

public class BinayTree {
	static class node{
		int data;
		node left;
		node right;
		node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static int indx=-1;
	public static node build(int nodes[]) {
		indx+=1;
		if(nodes[indx]==-1) {
			return null;
		}
		node a=new node(nodes[indx]);
		a.left=build(nodes);
		a.right=build(nodes);
		return a;
	}
	public static void preorder(node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	//inorder
	public static void inorder(node root) {
		if(root==null) {
			return;
		}
		//System.out.println(root.data);
		preorder(root.left);
		System.out.println(root.data);
		preorder(root.right);
	}
	// level order traversal
	public static void levelorder(node root) {
		if(root==null) {
			return;
		}
		Queue<node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			node currnode=q.remove();
			if(currnode==null) {
				break;
			}
			else {
			System.out.print(currnode.data+" ");
			if(currnode.left!=null) {
				q.add(currnode.left);
			}
			if(currnode.right!=null) {
				q.add(currnode.right);
			}
			}
		}
	}
	// height of a tree
	public static int height(node root) {
		if(root==null) {
			return 0;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		return Math.max(lh, rh)+1;
	}
	// count of node
	public static int count(node root) {
		if(root==null) {
			return 0;
		}
		int lc=count(root.left);
		int rc=count(root.right);
		return lc+rc+1;
	}
	
	// diameter of a tree
	public static int diameter(node root) {
		if(root==null) {
			return 0;
		}
		int leftdia=diameter(root.left);
		int lh=height(root.left);
		int rightdia=diameter(root.right);
		int rh=height(root.right);
		int self=lh+rh+1;
		return Math.max(Math.max(leftdia, rightdia), self);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		node root=build(nodes);
		//inorder(root);
		//System.out.println(root.data);
		levelorder(root);
		System.out.println(height(root));
		System.out.println("count of node is :"+count(root));
		int d=diameter(root);
		System.out.println(d);

	}

}
