// Link: https://leetcode.com/problems/rotate-array/description/

class Solution {
    public void rotate(int[] nums, int k) {
        if(k > nums.length) {
            k -= nums.length*(k/nums.length);
        }
        int[] nums2 = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(i + k > nums.length-1) {
                k -= (i+k);
            }

            nums2[i+k] = nums[i];
        }

        for(int j = 0; j < nums.length; j++) {
            nums[j] = nums2[j];
        }
    }
}