class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum[] = new long[nums.length];
        long s=0;
        for(int i=0;i<nums.length;i++) {
            s+=nums[i];
            sum[i]=s;
        }

        long sum2[] = new long[sum.length];
        for(int i=0;i<sum2.length;i++) {
            sum2[i] = s-sum[i];
        }

        for(int i=0;i<sum.length;i++) {
            sum[i] = sum[i]/(i+1);
        }

        for(int i=0;i<sum.length;i++) {
            System.out.print(sum2[i]+" ");
        }
        
        int div = nums.length-1;
        for(int i=0;i<sum2.length-1;i++) {
            sum2[i]/=div;
            div--;
        }
        long sum3[] = new long[sum.length];
        for(int i=0;i<sum.length;i++) {
            sum3[i]=Math.abs(sum[i]-sum2[i]);
        }
        long min = Long.MAX_VALUE;
        int min_idx=-1;
        for(int i=0;i<sum3.length;i++) {
            if(sum3[i]<min) {
                min = sum3[i];
                min_idx = i;
            }
        }
        return min_idx;
    }
}