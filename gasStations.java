// Link: https://leetcode.com/problems/gas-station/description/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int gain = gas[i] - cost[i];

            total += gain;
            tank += gain;

            if (tank < 0) {
                tank = 0;
                start = i + 1;
            }
        }

        return total < 0 ? -1 : start;
    }
}