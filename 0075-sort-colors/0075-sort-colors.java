class Solution {
    public void sortColors(int[] nums) { //Dutch National Flag Algo
        int lo =0;
        int mid =0;
        int hi = nums.length-1;
        int temp=0;
        while(mid<=hi) {
            if(nums[mid]==0) {
                temp = nums[lo];
                nums[lo] = nums[mid];
                nums[mid]=temp;
                lo++;
                mid++;
            }
            else if(nums[mid]==1) {
                mid++;
            }
            else {
                temp = nums[mid];
                nums[mid] = nums[hi];
                nums[hi] = temp;
                hi--;
            }
        }
    }
}