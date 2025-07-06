// Link: https://leetcode.com/problems/single-number/description/

class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for(int k : map.keySet()) {
            if(map.get(k) == 1) {
                return k;
            }
        }

        return 0;
    }
}