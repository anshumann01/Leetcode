import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger inta = new BigInteger(a,2);
        BigInteger intb = new BigInteger(b,2);
        BigInteger c = inta.add(intb);
        return c.toString(2);
    }
}