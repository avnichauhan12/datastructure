package Mypackg;

public class trapRain {
	public static int trappedwater(int height[]) {
		int n=height.length;
		// calculate left max boundary-array
		//calculate right max boundary-array
		int leftMax[]=new int[n];
		leftMax[0]=height[0];
		for(int i=1;i<n;i++) {
			leftMax[i]=Math.max(height[i],leftMax[i-1]);
		}
		int rightMax[]=new int[n];
		rightMax[n-1]=height[n-1];
		for(int j=n-2;j>=0;j--) {
			rightMax[j]=Math.max(height[j], rightMax[j+1]);
		}
		int tw=0;
		for(int i=0;i<n;i++) {
			int waterLevel=Math.min(leftMax[i],rightMax[i]);
			tw= tw+waterLevel-height[i];
		}
		return tw;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[]= {4,2,0,6,2,3,5};
		int TrappedWater=trappedwater(height);
		System.out.println(TrappedWater);
      
	}

}
