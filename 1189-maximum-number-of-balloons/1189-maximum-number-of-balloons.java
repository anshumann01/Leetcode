class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(int i=0;i<text.length();i++) {
            freq[text.charAt(i)-'a']++;
        }
        if(freq[1]>0 && freq[0]>0 && freq[11]>1 && freq[14]>1 && freq[13]>0) {
            return Math.min(freq[13],Math.min(freq[14]/2,Math.min(freq[11]/2,Math.min(freq[0],freq[1]))));
        }
        return 0;
    }
}