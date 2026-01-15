class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0;
        int totalCost=0;
        int n=gas.length;
        for(int i=0;i<n;i++) {
            totalGas+=gas[i];
            totalCost+=cost[i];
        }
        if(totalGas<totalCost) return -1;
        int idx=0;
        int fuel=0;
        for(int i=0;i<n;i++) {
            fuel=gas[i]-cost[i];
            if(fuel<0) {
                idx=i+1;
                fuel=0;
            }
        }
        return idx;
    }
}