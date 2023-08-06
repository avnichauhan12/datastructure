package Mypackg;
import java.util.*;


public class spanstock {
	public static void spanint(int stocks[],int span[]) {
		Stack<Integer> a =  new Stack<>();
		span[0]=1;
		a.push(0);

		for(int i=1;i<span.length;i++) {
			int currprice =stocks[i];
			while(!a.isEmpty()&& currprice>stocks[a.peek()]) {
				a.pop();
				
			}
			
			if(a.isEmpty()) {
				span[i]= i+1;
			}
			
			else {
				int prev = a.peek();
				span[i]=i-prev;
			}
			
			a.push(i);
		}
		
		
	}

	public static void main(String[] args) {
		
		int stocks[]= {100,80,60,70,60,85,100};
		int span[]=new int[stocks.length];
spanint(stocks,span);
for(int i =0;i<span.length;i++) {
	System.out.println(span[i]);
	
}
		}			

}

