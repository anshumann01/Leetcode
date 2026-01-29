class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
         int arr[] = new int[spells.length];
        for(int i=0;i<spells.length;i++) {
            int c=0;
            for(int j=0;j<potions.length;j++) {
                if((long)spells[i]*potions[j]>=success) {
                    c++;
                } 
            }
            arr[i]=c;
        }
        return arr;
    }
}