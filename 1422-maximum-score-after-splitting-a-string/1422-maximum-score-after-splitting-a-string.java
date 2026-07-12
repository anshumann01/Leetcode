class Solution {
    public int maxScore(String s) {
        int left[] = new int[s.length()-1];
        int right[] = new int[s.length()-1];

        for(int i=0;i<left.length;i++) {
            int c=0;
            for(int j=0;j<=i;j++) {
                if(s.charAt(j)=='0') {
                    c++;
                }
            }
            left[i]=c;
        }
        for(int i=1;i<s.length();i++) {
            int count =0;
            for(int j=i;j<s.length();j++) {
                if(s.charAt(j)=='1') {
                    count++;
                }
            }
            right[i-1]=count;
        }
        int max =0;
        for(int i=0;i<left.length;i++) {
            if(left[i]+right[i]>max) {
                max = left[i]+right[i];
            }
        }
        return max;
    }
}