class Solution {
    public int mySqrt(int x) {
        int sqrt=0;
        if(x==0 || x==1) return x;
        for(int i=0;i<x;i++) {
            if((long)i*i<=x) {
                sqrt=i;
            }
            else {
                break;
            }
        }
        return sqrt;
    }
}