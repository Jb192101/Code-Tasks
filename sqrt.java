// Link: https://leetcode.com/problems/sqrtx/description/

class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) {
            return x;
        }
        double l = 0;
        double r = x;

        double m = 0.0;
        while(r - l > 0.001) {
            m = (r + l) / 2;
            if(m*m == x) {
                return (int) m;
            } else if(m*m > x) {
                r = m;
            } else {
                l = m;
            }
        }

        return (int) r;
    }
}