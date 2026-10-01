class Solution {
    public int solve(int nums[],int i,int[] dp) {
        if(i>=nums.length) return 0;
        int take,skip=0;
        if(dp[i]==-1) {
            take = nums[i] + solve(nums,i+2,dp);
            skip = solve(nums,i+1,dp);
            dp[i] = Math.max(take,skip);
        }
        return dp[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
}