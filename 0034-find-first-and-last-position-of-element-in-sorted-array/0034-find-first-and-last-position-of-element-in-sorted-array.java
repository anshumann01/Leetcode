class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=findFirst(nums,target);
        int l=findLast(nums,target);
        return new int[]{f,l};
    }
    int findFirst(int[] nums,int target) {
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
                end= mid-1;
            }
        }
        return index;
    }
    int findLast(int[] nums,int target) {
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
                end=mid-1;
            }
        }
        return index;
    }
}