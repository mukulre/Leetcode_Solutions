class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int firstBuy = Integer.MAX_VALUE, firstSell = 0;
        int secondBuy = Integer.MAX_VALUE, secondSell = 0;
        for(int price : prices){
            firstBuy = Math.min(firstBuy, price);
            firstSell = Math.max(firstSell, price - firstBuy);
            secondBuy = Math.min(secondBuy, price - firstSell);
            secondSell = Math.max(secondSell, price - secondBuy);
        }
        return secondSell;
    }
}