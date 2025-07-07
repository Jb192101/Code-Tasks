// Link: https://leetcode.com/problems/container-with-most-water/description/

class Solution {
    public int maxArea(int[] height) {
        if(height.length == 2) {
            return Math.min(height[0], height[1]);
        }

        int ind1 = 0, ind2 = height.length-1;
        int prev = -1;
        int mnH;
        int i; // Промежуточный рез
        while(ind1 != ind2) {
            mnH = Math.min(height[ind1], height[ind2]);

            i = mnH * Math.abs(ind2 - ind1);
            if(prev < i) {
                prev = i;
            }

            if(height[ind1] < height[ind2]) {
                ind1++;
            } else {
                ind2--;
            }
        }

        return prev;
    }
}