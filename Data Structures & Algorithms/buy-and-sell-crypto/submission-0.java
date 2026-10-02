class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len == 1) return 0;
        int p1 = 0;
        int p2 = 1;
        int max = 0;
        while(p1 < len && p2 < len){
            if(prices[p1] > prices[p2]){
                p1 = p2;
            }else{
                max = Math.max(max, prices[p2] - prices[p1]);
            }
            p2++;
        }
        return max;
    }
}
