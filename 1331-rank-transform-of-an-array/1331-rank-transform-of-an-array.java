class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int nums[] = new int[arr.length];
       for(int i=0;i<arr.length;i++) {
        nums[i]=arr[i];
       }
       Arrays.sort(nums);
       int rank[] = new int[arr.length];
       HashMap<Integer,Integer> map = new HashMap<>();
       int r=1;
       for(int i=0;i<nums.length;i++) {
        if(!map.containsKey(nums[i])) {
            map.put(nums[i],r);
            r++;
        }
       }
       for(int i=0;i<arr.length;i++) {
        rank[i] = map.get(arr[i]);
        }
       return rank;
    }
}