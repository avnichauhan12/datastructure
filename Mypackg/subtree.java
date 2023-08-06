package Mypackg;

public class subtree {
	public static class node{
		int data;
		node left;
	      node right;
		public node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static boolean subtree(node root,node subroot) {
		if(root==null) {
			return false;
		}
		if(root.data==subroot.data) {
			if(isidentical(root,subroot)  ) {
				return true;
			}
		}
		boolean leftans=subtree(root.left,subroot);
		boolean rightans=subtree(root.right,subroot);
		return leftans || rightans;
		
	}
	public static boolean isidentical(node r,node subroot) {
		if(r==null && subroot==null) {
			return true;
		}
		else if(r==null || subroot==null || r.data!=subroot.data) {
			return false;
		}
		if(!isidentical(r.left,subroot.left)){
			return false;
		}
		if(!isidentical(r.right,subroot.right)){
			return false;
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
	     root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(4);

		/// sub tree
		node subroot=new node(2);
		subroot.left=new node(4);
		subroot.right=new node(5);
		///
		boolean a=subtree(root,subroot);
		System.out.println(a);
	}

}
