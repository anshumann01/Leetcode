class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int in = s.lastIndexOf(' ');
        return s.length()-1-in;
    }
}