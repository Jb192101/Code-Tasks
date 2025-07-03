// Link: https://leetcode.com/problems/powx-n/description/

class Solution {
    public double myPow(double x, int n) {
        if(n == 0) {
            return 1.0;
        }
        if(x == 1) {
            return x;
        }
        if(x == -1 && n % 2 == 0) {
            return 1.0;
        } else if(x == -1 && n % 2 == 1) {
            return x;
        }
        if(n == Integer.MIN_VALUE) {
            return 0.0;
        }
        double x1;
        if(n < 0) {
            x1 = 1/x;
            n = n * (-1);
            n += 2;
        } else {
            x1 = x;
        }

        for(int i = 1; i < n; i++) {
            x *= x1;
        }

        return x;
    }
}