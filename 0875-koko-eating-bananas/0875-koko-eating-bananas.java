class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int max=0;
      for(int i=0;i<piles.length;i++) {
        max=Math.max(piles[i],max);
      }
      int start=1,end=max;
      int ans=-1;
      while(start<=end) {
        int k=start+(end-start)/2;
        long hrs=hours(piles,k);
        if(hrs>h) {
            start=k+1;
        }
        else {
            ans=k;
            end=k-1;
        }
      }
      return ans;
    }
    long hours(int piles[],int k) {
        long hrs=0;
        for(int i=0;i<piles.length;i++) {
            hrs+=(piles[i]+k-1)/k;
        }
        return hrs;
    }
}