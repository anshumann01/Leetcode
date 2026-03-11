class Solution {
    public int findComplement(int n) {
        String binary = Integer.toBinaryString(n);
        String complement = "";
        for(int i=0;i<binary.length();i++) {
            if(binary.charAt(i)=='0') {
                complement+='1';
            }
            else {
                complement+='0';
            }
        }
        int number = Integer.parseInt(complement,2);
        return number;
    }
}