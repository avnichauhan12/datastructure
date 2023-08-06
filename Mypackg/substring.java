package Mypackg;

public class substring {
	public static void Substring(String str,String newstr,int i ) {
		if(i==str.length()) {
			if(newstr.length()==0) {
				System.out.println("null");
			}
			else {
			System.out.println(newstr);
			}
			return;
		}
		//yes
		Substring(str,newstr+str.charAt(i),i+1);
		// no
		Substring(str,newstr,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		String newstr="";
		int i=0;
		Substring(str,newstr,i);

	}

}
