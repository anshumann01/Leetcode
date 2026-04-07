class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for(int coin:bills) {
            if(coin==5) five++;
            else if(coin==10) {
                if(five==0) return false;
                ten++;
                five--;
            }
            else {
                if(five>=1 && ten>=1) {
                    ten--;
                    five--;
                }
                else if(five>=3) {
                    five-=3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}