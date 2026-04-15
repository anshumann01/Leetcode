class Solution {
    public int romanToInt(String s) {
        int num = 0;
        if(s.charAt(0)=='I') num++;
        if(s.charAt(0)=='V') num+=5;
        if(s.charAt(0)=='X') num+=10;
        if(s.charAt(0)=='L') num+=50;
        if(s.charAt(0)=='C') num+=100;
        if(s.charAt(0)=='D') num+=500;
        if(s.charAt(0)=='M') num+=1000;
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i)=='I') num++;
            if(s.charAt(i)=='V' && s.charAt(i-1)!='I') num+=5;
            if(s.charAt(i)=='V' && s.charAt(i-1)=='I') num+=3;
            if(s.charAt(i)=='X' && s.charAt(i-1)!='I') num+=10;
            if(s.charAt(i)=='X' && s.charAt(i-1)=='I') num+=8;
            if(s.charAt(i)=='L' && s.charAt(i-1)!='X') num+=50;
            if(s.charAt(i)=='L' && s.charAt(i-1)=='X') num+=30;
            if(s.charAt(i)=='C' && s.charAt(i-1)!='X') num+=100;
            if(s.charAt(i)=='C' && s.charAt(i-1)=='X') num+=80; //
            if(s.charAt(i)=='D' && s.charAt(i-1)!='C') num+=500;
            if(s.charAt(i)=='D' && s.charAt(i-1)=='C') num+=300;
            if(s.charAt(i)=='M' && s.charAt(i-1)!='C') num+=1000;
            if(s.charAt(i)=='M' && s.charAt(i-1)=='C') num+=800;
        }
        return num;
    }
}