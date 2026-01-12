class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++) {
            int sec_idx = target-nums[i];
            if(map.containsKey(sec_idx) && map.get(sec_idx)!=i) {
                arr[0]=map.get(sec_idx);
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}