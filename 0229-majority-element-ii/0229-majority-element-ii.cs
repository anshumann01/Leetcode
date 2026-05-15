public class Solution {
    public IList<int> MajorityElement(int[] nums) {
        int n = nums.Length;
        Dictionary<int,int> freq = new Dictionary<int,int>();
        for(int i=0;i<nums.Length;i++) {
            freq[nums[i]] = freq.GetValueOrDefault(nums[i],0)+1;
        }

        List<int> list = new List<int>();
        foreach(KeyValuePair<int,int> item in freq) {
            if(item.Value>(n/3)) {
                list.Add(item.Key);
            }
        }
        return list;
    }
}