class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String a="";
        for(int i=str.length-1;i>0;i--) {
            a+=str[i]+" ";
        }
        return a+str[0];
    }
}