class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums==null || nums.length<4) return list;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;) {
                int p = j+1;
                int q = nums.length-1;
                while(p<q) {
                    long sum = (long)nums[i]+nums[j]+nums[p]+nums[q];
                    if(sum==target) {
                        list.add(Arrays.asList(nums[i],nums[j],nums[p],nums[q]));
                        p++;
                        q--;
                        while(p<q && nums[p-1]==nums[p]) p++;
                    }
                    else if((int)sum<target) {
                        p++;
                    }
                    else {
                        q--;
                    }
                }
                j++;
                while(j<nums.length && nums[j]==nums[j-1]) j++;
            }
        }
        return new ArrayList<>(list);
    }
}