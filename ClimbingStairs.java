// Link: https://leetcode.com/problems/climbing-stairs/description/
// Note: Fibbonachi' sequence

class Solution {
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }
        int k1 = 1;
        int k2 = 1;
        int med;
        for(int i = 2; i < n; i++) {
            med = k2;
            k2 = k2 + k1;
            k1 = med;
        }
        
        return k1 + k2;
    }
}