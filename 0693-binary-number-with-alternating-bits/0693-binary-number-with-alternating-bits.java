class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        return !(binary.contains("00") || binary.contains("11"));
    }
}