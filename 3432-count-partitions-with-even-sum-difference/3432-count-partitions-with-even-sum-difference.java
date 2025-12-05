class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;;
        int total_sum = 0;
        for(int i=0;i<n;i++) {
            total_sum+=nums[i];
        }
        int count=0;
        int sum=0;
        for(int i=0;i<n-1;i++) {
            sum+=nums[i];
            if((sum-(total_sum-sum))%2==0) {
                count++;
            }
        }
        return count;
    }
}