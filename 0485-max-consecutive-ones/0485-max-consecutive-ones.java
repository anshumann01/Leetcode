class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        if(n==1 && nums[0]==0) {
            return 0;
        }
        for(int i=0;i<n;i++) {
            if(nums[i]==1) {
                count++;
                max=Math.max(count,max);
            }
            else if(nums[i]==0) {
                count=0;
            }
        }
        return max;
    }
}