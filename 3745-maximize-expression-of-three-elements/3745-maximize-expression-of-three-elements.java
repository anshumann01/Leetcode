class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int largest=nums[nums.length-1];
        int second_largest=nums[nums.length-2];
        int min=nums[0];
        
        return (largest+second_largest)-min;
    }
}