public class Solution {
    public int SingleNumber(int[] nums) {
        Dictionary<int,int> freq = new Dictionary<int,int>();
        for(int i=0;i<nums.Length;i++) {
            freq[nums[i]] = freq.GetValueOrDefault(nums[i],0)+1;
        }
        foreach(KeyValuePair<int,int> item in freq) {
            if(item.Value==1) {
                return item.Key;
            }
        }
        return -1;
    }
}