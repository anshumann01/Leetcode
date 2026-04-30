class Solution {
    public boolean isMatch(String s, String p) {
        // * - zero ya kitni bhi baar
        return s.matches(p);
    }
}