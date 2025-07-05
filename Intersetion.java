// Link: https://leetcode.com/problems/intersection-of-two-arrays/description/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> uniqEls = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            uniqEls.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++) {
            uniqEls.add(nums2[i]);
        }

        //System.out.println(uniqEls);

        List<Integer> ans = new ArrayList<>();
        for(int k = 0; k < nums1.length; k++) {
            for(int e = 0; e < nums2.length; e++) {
                if (uniqEls.contains(nums1[k]) && nums2[e] == nums1[k]) {
                    ans.add(nums1[k]);
                    uniqEls.remove(nums1[k]);
                }
            }
        }

        return ans.stream().mapToInt(i->i).toArray();
    }
}