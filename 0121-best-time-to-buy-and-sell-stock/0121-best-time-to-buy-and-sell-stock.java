class Solution {
    public int maxProfit(int[] prices) {
        int length=prices.length;

        int[] minHitList=new int[length];
        int min=Integer.MAX_VALUE;
        for(int index=0;index<length;index++){
                minHitList[index]=Math.min(prices[index],min);
                min=minHitList[index];
        }

        int[] maxHitList=new int[length];
        int max=Integer.MIN_VALUE;
        for(int index=length-1;index>=0;index--){
                maxHitList[index]=Math.max(prices[index],max);
                max=maxHitList[index];
        }
        int res=0;
        for(int index=0;index<length;index++){
                res=Math.max(maxHitList[index]-minHitList[index],res);
        }
        return res;
    }
}