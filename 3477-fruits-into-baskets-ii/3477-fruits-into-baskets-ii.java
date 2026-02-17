class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(fruits[i]<=baskets[j]) {
                    fruits[i]=0;
                    baskets[j]=0;
                    break;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++) {
            if(fruits[i]>0) count++;
        }
        return count;
    }
}