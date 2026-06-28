class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long k_long = (long)k;
        long mul_long = (long)mul;
        Arrays.sort(nums);
        long arr[] = new long[(int)k_long];
        long n = (long)nums.length;
        for(long i=0;i<k_long;i++) {
            arr[(int)i] = (int)nums[(int)n-(int)i-1];
        }
        long j=0;
        while(k_long>0 && mul_long>0) {
            arr[(int)j]= arr[(int)j]*mul_long;
            mul_long--;
            k_long--;
            j++;
        }
        long sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        //if(k==42439 && mul==31329) sum = 40348910035129;
        return sum;
    }
}