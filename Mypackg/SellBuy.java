package Mypackg;

public class SellBuy {
	public static int buyAndSellStock(int prices[]) {
		int buyprice =Integer.MAX_VALUE;
		int maxProfit =0;
		for(int i=0;i<prices.length;i++) {
			if(buyprice < prices[i]) {
				int profit =prices[i]-buyprice;
				maxProfit=Math.max(maxProfit, profit);
			}
			else {
				buyprice=prices[i];
			}
		}
		return maxProfit;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[]= {7,1,5,3,6,4};
		System.out.println(buyAndSellStock(prices));
        
	}

}
