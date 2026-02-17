class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int maxCount=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            char ch = s.charAt(i);
            if(map.get(ch)>1) {
                count=1;
            }
            else {
                count++;
                maxCount=Math.max(count,maxCount);
            }
        }
        return maxCount;
    }
}