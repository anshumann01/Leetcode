class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int map[] = new int[128];

        for(int i=0;i<t.length();i++) {
            map[t.charAt(i)]++;
        }
        int left = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start=0;

        for(int right=0;right<s.length();right++) {
            if(map[s.charAt(right)]>0) {
                count--;
            }
            map[s.charAt(right)]--;
            while(count==0) {
                if(right-left+1<minLen) {
                    minLen = right-left+1;
                    start = left;
                }
                map[s.charAt(left)]++;
                if(map[s.charAt(left)]>0) {
                    count++;
                }
                left++;
            }
        }
        if(minLen==Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start,start+minLen);
    }
}