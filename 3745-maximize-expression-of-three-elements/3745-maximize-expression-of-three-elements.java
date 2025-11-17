class Solution {
    public int maximizeExpressionOfThree(int[] nums) {

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > largest) {
                second_largest = largest;
                largest = nums[i];
            } 
            else if (nums[i] > second_largest) {
                second_largest = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return (largest + second_largest) - min;
    }
}
