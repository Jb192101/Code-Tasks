// Link: https://leetcode.com/problems/median-of-two-sorted-arrays/description/

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1 = 0, p2 = 0;
        int[] newArray = new int[nums1.length + nums2.length];

        int i = 0;
        int c = 0;
        while(i != newArray.length) {
            if(p1 != nums1.length && p2 != nums2.length) {
                if(nums1[p1] < nums2[p2]) {
                    c = nums1[p1];
                    p1++;
                } else {
                    c = nums2[p2];
                    p2++;
                }
            } else if(p1 == nums1.length && p2 != nums2.length) {
                c = nums2[p2];
                p2++;
            } else if(p1 != nums1.length) {
                c = nums1[p1];
                p1++;
            }

            newArray[i] = c;
            i++;
        }

        //System.out.println(Arrays.toString(newArray));

        if(newArray.length % 2 == 1) {
            return newArray[newArray.length/2];
        } else {
            return (double) (newArray[newArray.length / 2] + newArray[newArray.length / 2 - 1]) / 2;
        }
    }
}