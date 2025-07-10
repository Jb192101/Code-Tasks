// Link: https://leetcode.com/problems/find-peak-element/description/

class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }

        int ind1 = 0, ind2 = nums.length-1;
        boolean isChanged = false;
        while(ind1 < ind2) {
            if(ind1 == 0 && nums[ind1] > nums[ind1+1] && !isChanged) {
                return ind1;
            } else if(ind2 == nums.length-1 && nums[ind2] > nums[ind2-1] && !isChanged) {
                return ind2;
            } else if(ind1 == 0 && ind2 == nums.length-1 && !isChanged) {
                ind1++;
                ind2--;
                isChanged = true;
            }

            if(ind1 != 0 && ind2 != nums.length-1) {
                if(nums[ind1] > nums[ind1-1] && nums[ind1] > nums[ind1+1] && nums[ind1] > nums[ind2]) {
                    return ind1;
                } else {
                    ind1++;
                }

                if(nums[ind2] > nums[ind2-1] && nums[ind2] > nums[ind2+1] && nums[ind2] > nums[ind1]) {
                    return ind2;
                } else {
                    ind2--;
                }
            }
        }

        return ind1;
    }
}