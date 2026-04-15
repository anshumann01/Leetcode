class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int min_value = Integer.MAX_VALUE;
        int n = words.length;
        for(int i=0;i<words.length;i++) {
            if(words[(startIndex+i)%words.length].equals(target)) {
                min_value = Math.min(min_value,i);
            }
            else if(words[(startIndex-i+n)%n].equals(target)) {
                min_value = Math.min(min_value,i);
            }
        }
        if(min_value == Integer.MAX_VALUE) {
            return -1;
        }
        return min_value;
    }
}