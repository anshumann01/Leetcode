class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int sum=0;
        int n = bits.length;
        if(n==1) return true;
        for(int i=0;i<bits.length-1;i++) {
            sum+=bits[i];
        }
        if(sum+bits[n-1]==0) return true;
        if(sum<n-1 && bits[n-1]==0 && bits[n-2]!=1) {
            return true;
        }
        return false;
    }
}