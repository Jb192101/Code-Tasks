// Link: https://leetcode.com/problems/divide-two-integers/description/

class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 0) {
            return 0;
        }

        long res = dividend;
        if(res == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        return (int) dividend/divisor;
    }
}