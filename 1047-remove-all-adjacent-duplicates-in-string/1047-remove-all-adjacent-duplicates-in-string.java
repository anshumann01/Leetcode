class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        String str = "";
        for(char ch:s.toCharArray()) {
            if(!st.isEmpty() && st.peek()==ch) st.pop();
            else st.push(ch);
        }
        while(!st.isEmpty()) {
            str=st.pop()+str;
        }
         return str;
    }
}