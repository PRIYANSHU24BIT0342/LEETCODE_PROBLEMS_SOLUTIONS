class Solution {
    public int maxProfit(int[] prices) {
        long sum=0;
        long maxi = Long.MIN_VALUE;
        for(int i =1;i<prices.length;i++){
            sum=sum+prices[i]-prices[i-1];
            if(sum<0){
                sum=0;
            }
            maxi=Math.max(maxi,sum);
        }
    return (int)maxi;

        
    }
}