class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        String str="";
        for(char ch:s.toCharArray()) {
            if(!stk.isEmpty() && stk.peek()==ch) {
                stk.pop();
            }
            else {
                stk.push(ch);
            }
        }
        while(!stk.isEmpty()) {
            str=stk.pop()+str;
        }
        return str;
    }
}