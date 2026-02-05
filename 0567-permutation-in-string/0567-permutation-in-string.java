class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        for(int i=0;i<s2.length()-k;i++) {
            String sub = s2.substring(i,i+k);
            if(isAnagram(s1,sub)) return true;
        }
        return false;
    }
    public boolean isAnagram(String a,String b) {
        if(a.length()!=b.length()) {
            return false;
        }
        int n = a.length();
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(int i=0;i<n;i++) {
            freq1[a.charAt(i)-'a']++;
            freq2[b.charAt(i)-'a']++;
        }
        return Arrays.equals(freq1,freq2);
    }
}