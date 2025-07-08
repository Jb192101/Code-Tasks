// Link: https://leetcode.com/problems/maximum-product-subarray/description/
// Note: Kadane's algorithm

class Solution {
    public int maxProduct(int[] nums) {
        int l = 1;
        int r = 1;
        int mx = nums[0];

        for(int i = 0; i < nums.length; i++) {
            r *= nums[i];
            mx = Math.max(mx, r);
            if(r == 0) {
                r = 1;
            }
        }

        for(int i = nums.length-1; i >= 0; i--) {
            l *= nums[i];
            mx = Math.max(mx, l);
            if(l == 0) {
                l = 1;
            }
        }

        return mx;
    }
}