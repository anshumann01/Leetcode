class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++) {
            if(arr[i]=='(') st.push(i);
            else if(arr[i]==')') {
                if(!st.isEmpty()) st.pop();
                else arr[i]='#';
            }
        }
        while(!st.isEmpty()) arr[st.pop()] = '#';
        String str="";
        for(char ch:arr) {
            if(ch!='#') str+=ch;
        }
        return str;
    }
}