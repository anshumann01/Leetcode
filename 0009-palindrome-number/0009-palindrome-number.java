class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int a=0;
        while(n>0) {
            a=(a*10)+(n%10);
            n=n/10;
        }
        if(a==x) {
            return true;
        }
        return false;
    }
}