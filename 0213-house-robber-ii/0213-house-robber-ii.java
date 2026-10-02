class Solution {
    public int solve(int nums[],int[] dp) {
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int curr=0;
        for(int i=2;i<nums.length;i++) {
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int nums1[] = new int[n-1];
        int nums2[] = new int[n-1];
        int dp1[] = new int[n-1];
        int dp2[] = new int[n-1];
        for(int i=0;i<n-1;i++) {
            nums1[i]=nums[i];
        }
        for(int i=1;i<n;i++) {
            nums2[i-1] = nums[i];
        }
        return Math.max(solve(nums1,dp1),solve(nums2,dp2));
    }
}