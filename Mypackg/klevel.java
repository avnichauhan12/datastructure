package Mypackg;
import java.util.*;

public class klevel {
	public static class Node{
		int data;
		Node left;
		Node right;
	 Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
	}

	public static void level(Node a,int level,int k) {
		if(k==level) {
			System.out.println(a.data);
			
			return;
		}
		level(a.left,level+1,3);
		level(a.right,level+1,3);
		 
		
	}
	public static boolean getPath(Node root,int n,ArrayList<Integer>) {
		
	}
	public static Node lca(Node root,int n1,int n2) {
		ArrayList<Integer> path1=new ArrayList<>();
		ArrayList<Integer> path2=new ArrayList<>();
		getPath(root,n1,path1);
		getPath(root,n2,path2);
		for(int i=0;i<path1.size() && path2.size();i++ ) {
			if(path1.get(i)!= path2.get(i)) {
				break;
			}
		}
		Node lca=path1.get(i-1);
	}
	public static void main(String[] args) {
		Node a =new Node(1);
		a.left=new Node(2);
		a.right = new Node(3);
		a.left.left=new Node(4);
		a.left.right =new Node(5);
		a.right.left=new Node(6);
		a.right.right = new Node(7);
		
		int k =3;
		level(a,1,k);
	}


}
