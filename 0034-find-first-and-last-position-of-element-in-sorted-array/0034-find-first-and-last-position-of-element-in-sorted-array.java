class Solution {
    public static int findleftbound(int[] nums,int target) {
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(nums[mid]==target) {
                index=mid;
                end=mid-1;
            }
            else if(nums[mid]<target) {
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return index;
    }
    public static int findrightbound(int[] nums,int target) {
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(nums[mid]==target) {
                index=mid;
                start=mid+1;
            }
            else if(nums[mid]<target) {
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int left = findleftbound(nums,target);
        int right = findrightbound(nums,target);
        return new int[]{left,right};
    }
}