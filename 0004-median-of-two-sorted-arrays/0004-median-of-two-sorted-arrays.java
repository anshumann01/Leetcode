class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[n+m];
        for(int i=0;i<m;i++) {
            arr[i]=nums1[i];
        }
        for(int i=m;i<n+m;i++) {
            arr[i]=nums2[i-m];
        }
        Arrays.sort(arr);
        double ans =0;
        if(arr.length%2==0) {
            ans = (arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;
        }
        else {
            ans = arr[arr.length/2];
        }
        return ans;
    }
}