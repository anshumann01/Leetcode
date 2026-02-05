class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> nums = new ArrayList<>();
        int k=p.length();
        int f1[] = new int[26]; //for calculating frequency of p
        for(char ch:p.toCharArray())f1[ch-'a']++;
        int f2[] = new int[26];
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            f2[ch-'a']++;
            if(i<k-1) continue;
            if(Arrays.equals(f1,f2)) {
                nums.add(i-k+1);
            }
            f2[s.charAt(i-k+1)-'a']--;
        }
        return nums;
    }
}