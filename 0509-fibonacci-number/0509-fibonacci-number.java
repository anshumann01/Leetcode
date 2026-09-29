class Solution {
    public int solve(int n) {
        int prev2 =0;
        int prev1=1;
        if(n==0) {
            return prev2;
        }
        for(int i=2;i<=n;i++) {
            int curr = prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public int fib(int n) {
        return solve(n);
    }
}