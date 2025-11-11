class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0 ||n==1) return n;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++) {
            set.add(nums[i]);
        }
        int idx =0;
        for (Integer num : set) {
            nums[idx]=num;
            idx++;
        }
        int count =1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<n;i++) {
            if(nums[i-1]+1==nums[i]) {
                count++;
            }
            else {
                list.add(count);
                count=1;
            }
        }
        list.add(count);
        int maxCount = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++) {
            maxCount = Math.max(maxCount,list.get(i));
        }
        return maxCount;
    }
}