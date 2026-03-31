class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals("C") && 
                !operations[i].equals("D") && 
                !operations[i].equals("+")) {

                int val = Integer.parseInt(operations[i]);
                st.push(val);
                sum += val;
            }

            else if (operations[i].equals("C")) {
                sum -= st.peek();
                st.pop();
            }

            else if (operations[i].equals("D")) {
                int val = st.peek();
                st.push(val * 2);
                sum += val * 2;
            }

            else if (operations[i].equals("+")) {
                int top = st.pop();
                int second = st.peek();
                int newScore = top + second;

                st.push(top);        
                st.push(newScore);   
                sum += newScore;
            }
        }
        return sum; 
    }
}