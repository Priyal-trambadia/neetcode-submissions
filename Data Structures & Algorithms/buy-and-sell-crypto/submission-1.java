// two pointer approch
class Solution {
    public int maxProfit(int[] prices) {
       int l=0, r=1;
       int maxP=0;
       while(r<prices.length){
        if(prices[l]<prices[r]){
            int profit = prices[r] - prices[l];  //right p move all time because left p is min
            maxP =Math.max(maxP,profit);
        }
        else{
            l=r;
        }
        r++;
       } 
       return maxP;
    }
}
