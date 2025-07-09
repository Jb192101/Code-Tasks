// Link: https://leetcode.com/problems/maximum-subarray/description/
// Note: Kadane's algorithm (again...)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) {
            return 0;
        } else if(nums.length == 1) {
            return nums[0];
        }

        int mxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            mxSum = Math.max(mxSum, curSum);

            if(curSum < 0)
                curSum = 0;
        }

        return mxSum;
    }
}