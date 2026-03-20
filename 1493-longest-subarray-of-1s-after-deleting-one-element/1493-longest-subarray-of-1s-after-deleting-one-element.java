class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount=0,longestWindow=0,start=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) zeroCount++;
            while(zeroCount>1) {
                zeroCount -= (nums[start]==0?1:0);
                start++;
            }
            longestWindow=Math.max(longestWindow,i-start);
        }
        return longestWindow;
    }
}