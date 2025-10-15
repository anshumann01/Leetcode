class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive[] = new int[nums.length/2];
        int negative[] = new int[nums.length/2];
        int neg=0;
        int pos=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<0) {
                negative[neg]=nums[i];
                neg++;
            }
            else {
                positive[pos]=nums[i];
                pos++;
            }
        }
        pos=0;
        neg=0;
        for(int i=0;i<nums.length;i+=2) {
            nums[i]=positive[pos];
            pos++;
        }
        for(int i=1;i<nums.length;i+=2) {
            nums[i] = negative[neg];
            neg++;
        }
        return nums;
    }
}