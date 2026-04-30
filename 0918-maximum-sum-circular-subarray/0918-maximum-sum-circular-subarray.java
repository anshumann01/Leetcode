class Solution {
    public int kadanes(int[] nums) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int i=0;
        while(i<nums.length) {
            cs+=nums[i];
            ms=Math.max(cs,ms);
            if(cs<0) {
                cs=0;
            }
            i++;
        }
        return ms;
    }
    public int minkadanes(int[] nums) {
        int cs=0;
        int ms=Integer.MAX_VALUE;
        int i=0;
        while(i<nums.length) {
            cs+=nums[i];
            ms=Math.min(cs,ms);
            if(cs>0) {
                cs=0;
            }
            i++;
        }
        return ms;
    }
    public int maxSubarraySumCircular(int[] nums) {
        //if(all eles negative) return totalSum;
        //totalSum - (minSum);
        //return Math.max(kadanes,(Total-minSum));
        //negTotal is sum of all elements of arr after multiplying them by -1;
        //minSum is the sum of minimum sum Subarray
        //kadanes - normal kadanes algo for maximum Subarray Sum
        int neg=0;
        int totalSum=0;
        int maxKadanes = kadanes(nums);
        int minKadanes = minkadanes(nums);
        for(int i=0;i<nums.length;i++) {
            totalSum+=nums[i];
            if(nums[i]<0){
               neg++; 
            }
        }
        if(neg==nums.length) return maxKadanes;
        return Math.max(maxKadanes,totalSum-minKadanes);
    }
}