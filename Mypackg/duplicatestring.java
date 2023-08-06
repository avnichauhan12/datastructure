package Mypackg;

public class duplicatestring {
	public static void remove(String str,int i,StringBuilder newstr,boolean map[]) {
		//StringBuilder newstr =new StringBuilder();
		//boolean map[]=new boolean[26];
		int n=str.length();
		int curr=str.charAt(i)-'a';
		if(i==n-1) {
			System.out.println(newstr);
			return;
		}
		if(map[curr]==true) {
			remove(str,i+1,newstr,map);
		}
		else {
			newstr.append(str.charAt(i));
			map[curr]=true;
			remove(str,i+1,newstr,map);
		}
		//System.out.println(newstr.toString());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="avniiiiiiichaaauuuuun";
		int i=0;
		StringBuilder newstr =new StringBuilder();
		boolean map[]=new boolean[26];
		remove(str,i,newstr,map);

	}

}
