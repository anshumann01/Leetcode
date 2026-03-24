class Solution {
    public String removeDuplicates(String s) {
        String ns = "";
        for(char ch : s.toCharArray()){
            if(ns.length()>0 && ns.charAt(ns.length()-1)==ch){
                ns = ns.substring(0,ns.length()-1);
            }
            else
            ns +=ch;
        }
         return ns;
    }
}