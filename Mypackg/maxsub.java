/**
 * 
 */
package Mypackg;

/**
 * @author Avni Chauhan
 *
 */
public class maxsub {
	public static void maxsum(int arr[]) {
		int prefix[]=new int[arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
				prefix[i]=sum;
				
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
				if(i==0) {
					System.out.println("sum = "+prefix[j]);
				}
				else {
				System.out.println("sum "+ (prefix[j]-prefix[i-1]));
				}
			}
			System.out.println();
		}
	}
     
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,-30,40,-50,60};
		maxsum(arr);
		

	}

}
