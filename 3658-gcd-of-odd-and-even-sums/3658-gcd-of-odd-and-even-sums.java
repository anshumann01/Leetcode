class Solution {
    public int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {
        if(n==0) return 0;
        int oddSum =1;
        int evenSum = 2;
        int odd = 1;
        int even = 2;

        for (int i = 0; i < n-1; i++) {
            odd+=2;
            oddSum+=odd;

            even+=2;
            evenSum+=even;
        }
        return gcd(oddSum,evenSum);
    }
}