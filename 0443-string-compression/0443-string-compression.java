class Solution {
    public int compress(char[] chars) {
        String newStr="";
        for(int i=0;i<chars.length;i++) {
            Integer count = 1;
            while(i<chars.length-1 && chars[i]==chars[i+1]) {
                count++;
                i++;
            }
            newStr+=chars[i];
            if(count>1) {
                newStr+=count.toString();
            }
        }
        for(int i=0;i<newStr.length();i++) {
            chars[i]=newStr.charAt(i);
        }
        return newStr.length();
    }
}