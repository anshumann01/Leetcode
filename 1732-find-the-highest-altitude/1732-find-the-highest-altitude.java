class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int ans[] = new int[n+1];
        ans[0]=0;
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum+=gain[i-1];
            ans[i]=sum;
        }
        int num=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++) {
            num=Math.max(num,ans[i]);
        }
        return num;
    }
}