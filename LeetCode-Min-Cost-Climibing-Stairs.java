class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int first=cost[0];
        int second=cost[1];
        int cost1=0;
        for(int i=2;i<cost.length;i++)
        {
            cost1=cost[i]+Math.min(first,second);
            first=second;
            second=cost1;
        }
        return Math.min(first,second);   
    }
}
