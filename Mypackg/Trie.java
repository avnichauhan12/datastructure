package Mypackg;

public class Trie {
	public static class node{
		node children[]=new node[26];
		boolean eow=false;
		node(){
			for(int i=0;i<26;i++) {
				children[i]=null;
			}
		}
	}
	public static node root=new node();
	public static void insert(String word) {
		node curr=root;
		for(int i=0;i<word.length();i++) {
			int indx=word.charAt(i)-'a';
			if(curr.children[indx]==null) {
				curr.children[indx]=new node();
			}
			curr=curr.children[indx];
		}
		curr.eow=true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word[]= {"the","a","there","their","any","these"};
		for(int i=0;i<word.length;i++) {
			insert(word[i]);
		}

	}

}
