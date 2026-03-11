class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxCount=0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(set.contains(ch)) {
                maxCount = Math.max(set.size(),maxCount);
                set.clear();
                set.add(ch);
            }
            else {
                set.add(ch);
            }
        }
        return maxCount;
    }
}