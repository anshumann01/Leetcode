class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        int lo = 0;
        int hi = numbers.length-1;
        while(lo<hi) {
            if(numbers[lo]+numbers[hi]==target) {
                res[0]=lo+1;
                res[1]=hi+1;
                break;
            }
            else if(numbers[lo]+numbers[hi]<target) {
                lo++;
            }
            else {
                hi--;
            }
        }
        return res;
    }
}