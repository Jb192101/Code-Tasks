// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        } else if(nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }

        int ind1 = 0, ind2 = nums.length-1;
        int min = Integer.MAX_VALUE;
        int d;
        while(ind1 != nums.length/2 + 1 && ind2 != nums.length/2 -1) {
            d = Math.min(nums[ind1], nums[ind2]);
            min = Math.min(min, d);
            ind1++;
            ind2--;
        }

        return min;
    }
}