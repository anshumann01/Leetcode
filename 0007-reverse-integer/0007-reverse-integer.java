class Solution {
    public int reverse(int x) {
        boolean neg=false;
        if(x==0) {
            return 0;
        }
        if(x<0) {
            x*=-1;
            neg=true;
        }
        int a=0;
        while(x>0) {
            if(a>Integer.MAX_VALUE/10) {
            return 0;
            }
            a=(a*10)+(x%10);
            x=x/10;
        }
        if(!neg) {
            return a;
        }
        return -a;
    }
}